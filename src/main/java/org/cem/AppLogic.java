package org.cem;

import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.GlobalKTable;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class AppLogic {

    public static KafkaStreams AppTopology(Properties properties){

        StreamsBuilder builder = new StreamsBuilder();

        GlobalKTable<String , DeviceInformation> deviceInfoGT = builder.globalTable(AppsConfig.devicesinfoTopic , Consumed.with(AppSerdes.String(), AppSerdes.DeviceInformation()));

        GlobalKTable<String, ProbesErrorsDescription> probesErrorsGT = builder.globalTable(AppsConfig.probesErrorTopic, Consumed.with(AppSerdes.String(), AppSerdes.ProbesErrorsDescription()));

        GlobalKTable<String , SiteLocation> siteLocationGT = builder.globalTable(AppsConfig.locationTopic, Consumed.with(AppSerdes.String(), AppSerdes.SiteLocation()));

        KStream<String ,VoiceStream > KS0 = builder.stream(AppsConfig.voiceStreamTopic, Consumed.with(AppSerdes.String(), AppSerdes.VoiceStream()));

        KStream<String , VoiceStreamEnriched> addSiteInfo = KS0.selectKey((key , value)-> AppLogic.getCgi(value.getLac(),value.getSac()))
                .join(siteLocationGT,(leftKey, leftValue)-> leftKey,
                        (leftValue, rightValue) -> addSiteInformation(leftValue , rightValue));

        KStream<String , VoiceStreamEnriched> addDeviceInfo = addSiteInfo.selectKey((key , value) -> AppLogic.getHandsetTacCode(value.getImei()))
                .join(deviceInfoGT ,(leftKey, leftValue)-> leftKey,
                        (leftValue, rightValue) -> addDeviceInformation(leftValue , rightValue));

        KStream<String , VoiceStreamEnriched> addErrorDesd = addDeviceInfo.selectKey((key , value)-> getErrorCode(value.getTechnology(),
                value.getStreamType(), value.getRanapCause(),value.getDtapCcCause()))
                .join(probesErrorsGT,(leftKey, leftValue)-> leftKey,
                        (leftValue, rightValue) -> addErrorDescription(leftValue , rightValue));

        KStream<String , VoiceStreamOut> finalStream = addErrorDesd.mapValues(values ->
                processFinalVoiceStream(values)
        );


        finalStream.selectKey((key, value) -> value.getCgi()).to(AppsConfig.enrichedVoiceStream,
                Produced.with(AppSerdes.String(), AppSerdes.VoiceStreamOut()));


        KafkaStreams kafkaStreams = new KafkaStreams(builder.build(),properties);

        return kafkaStreams;
    }


    public static String getCgi(String lac , String sac){
        if (lac.length() > 7)
            return lac.substring(0,7)+ StringUtils.leftPad(lac.substring(7),5,"0")
                +"-"+sac;
        return lac+""+sac;

    }
    public static String getErrorCode(String technology, String streamType ,String ranapCause ,String dtapCcCause){
        return technology+""+streamType+""+StringUtils.leftPad(ranapCause,3,"0")+""+StringUtils.leftPad(dtapCcCause,3,"0");

    }
    private static String generateHbaseKey(String imsi , Long StartTime) {
        String reversedStartTime;
        LocalDateTime dateTime = LocalDateTime.ofEpochSecond(StartTime, 0, ZoneOffset.ofHours(3));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHH");
        String date =  dateTime.format(formatter);
        String reversedImsi = new StringBuilder(imsi).reverse().toString();

        if (date.equals("1970010103")){
            Date now = new Date();
            SimpleDateFormat nowDateFormatter = new SimpleDateFormat("yyyyMMddHH");
            date = nowDateFormatter.format(now);
        }

        if(StartTime < 1){
            Random rand = new Random();
            reversedStartTime = Integer.toString(rand.nextInt(1000000));
        }else{
            reversedStartTime = new StringBuilder(StartTime.toString()).reverse().toString();
        }

        return reversedImsi+"_"+date+"_"+reversedStartTime;
    }

    public static String getHandsetTacCode(String imei){
        if (imei.length() > 8)
            return imei.substring(0,8);
        return imei;
    }

    private static long calculateCallDuration(int callScenario , long conAckTimeSec , long releaseTimeSec){
        if (callScenario == 0){
            if(releaseTimeSec < 0 || conAckTimeSec == 0)
                return 0 ;
            else
                return releaseTimeSec - conAckTimeSec;
        }
        return 0;
    }

    private static String getCallScenario(int callScenario){
        if(callScenario == 0)
            return "outgoing";
        return "incoming";

    }
    private static String  epochToDateTime(Long timeInSec){
        LocalDateTime dateTime = LocalDateTime.ofEpochSecond(timeInSec, 0, ZoneOffset.ofHours(3));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        if (dateTime.format(formatter).contains("1970-01-01"))
            return "0";
        return dateTime.format(formatter);
    }

    public static VoiceStreamEnriched addSiteInformation(VoiceStream voiceStream , SiteLocation siteLocation){
        VoiceStreamEnriched voiceStreamEnriched = new VoiceStreamEnriched();
        return voiceStreamEnriched.withCallScenario(voiceStream.getCallScenario())
                .withTechnology(voiceStream.getTechnology())
                .withStreamType(voiceStream.getStreamType())
                .withCallStartTimeSecs(voiceStream.getCallStartTimeSecs())
                .withCallStartTimeUsecs(voiceStream.getPagingTimeStampUsecs())
                .withImsi(voiceStream.getImsi())
                .withImei(voiceStream.getImei())
                .withMsisdn(voiceStream.getMsisdn())
                .withCallingMsisdn(voiceStream.getCallingMsisdn())
                .withCalledMsisdn(voiceStream.getCalledMsisdn())
                .withLac(voiceStream.getLac())
                .withSac(voiceStream.getSac())
                .withDtapCcCause(voiceStream.getDtapCcCause())
                .withDtapMmCause(voiceStream.getDtapMmCause())
                .withDtapRrCause(voiceStream.getDtapRrCause())
                .withRanapCause(voiceStream.getRanapCause())
                .withConAckTimeSecs(voiceStream.getConAckTimeSecs())
                .withConAckTimeUsecs(voiceStream.getConAckTimeUsecs())
                .withReleaseTimeSecs(voiceStream.getReleaseTimeSecs())
                .withReleaseTimeUsecs(voiceStream.getReleaseTimeUsecs())
                .withCalledNumberType(voiceStream.getCalledNumberType())
                .withCalledNumberType(voiceStream.getCalledNumberType())
                .withSignalingEndTimeSecs(voiceStream.getSignalingEndTimeSecs())
                .withSignalingEndTimeUsecs(voiceStream.getSignalingEndTimeUsecs())
                .withPagingTimeStampSecs(voiceStream.getPagingTimeStampSecs())
                .withPagingTimeStampUsecs(voiceStream.getPagingTimeStampUsecs())
                .withProbeId(voiceStream.getProbeId())
                .withSiteName(siteLocation.getSiteName())
                .withCellRegion(siteLocation.getCellRegion())
                .withLongitudeDec(siteLocation.getLongitudeDec())
                .withLatitudeDec(siteLocation.getLatitudeDec());
    }

    public static VoiceStreamEnriched addErrorDescription(VoiceStreamEnriched voiceStreamEnriched , ProbesErrorsDescription errorDesc){
         return voiceStreamEnriched
                 .withDsFinalCauseStatus(errorDesc.getDsFinalCauseStatus())
                 .withDsSimplifiedCause(errorDesc.getDsSimplifiedCause());
    }
    public static VoiceStreamEnriched addDeviceInformation(VoiceStreamEnriched voiceStreamEnriched , DeviceInformation deviceInformation){
        return voiceStreamEnriched
                .withHandsetName(deviceInformation.getHandsetName())
                .withManufacturer(deviceInformation.getManufacturer())
                .withOSandVersion(deviceInformation.getOperatingSystem()+" v: "+deviceInformation.getOsVersion());
    }

    public static VoiceStreamOut processFinalVoiceStream(VoiceStreamEnriched voiceStreamEnriched){
        VoiceStreamOut voiceStreamOut = new VoiceStreamOut();
        return voiceStreamOut
                .withId(generateHbaseKey(voiceStreamEnriched.getImsi() , voiceStreamEnriched.getConAckTimeSecs()))
                .withCallDuration(calculateCallDuration(voiceStreamEnriched.getCallScenario(),
                        voiceStreamEnriched.getConAckTimeSecs(),
                        voiceStreamEnriched.getReleaseTimeSecs()))
                .withCallScenario(getCallScenario(voiceStreamEnriched.getCallScenario()))
                .withTechnology(voiceStreamEnriched.getTechnology())
                .withCallStartTime(epochToDateTime(voiceStreamEnriched.getCallStartTimeSecs()))
                .withImsi(voiceStreamEnriched.getImsi())
                .withImei(voiceStreamEnriched.getImei())
                .withCgi(getCgi(voiceStreamEnriched.getLac(), voiceStreamEnriched.getSac()))
                .withCellRegion(voiceStreamEnriched.getCellRegion())
                .withSiteName(voiceStreamEnriched.getSiteName())
                .withCalledMsisdn(voiceStreamEnriched.getCalledMsisdn())
                .withCallingMsisdn(voiceStreamEnriched.getMsisdn())
                .withHandsetName(voiceStreamEnriched.getHandsetName())
                .withProbeId(voiceStreamEnriched.getProbeId())
                .withPagingTimeStamp(epochToDateTime(voiceStreamEnriched.getPagingTimeStampSecs()))
                .withConAckTime(epochToDateTime(voiceStreamEnriched.getConAckTimeSecs()))
                .withReleaseTime(epochToDateTime(voiceStreamEnriched.getReleaseTimeSecs()))
                .withLatitudeDec(voiceStreamEnriched.getLatitudeDec())
                .withLongitudeDec(voiceStreamEnriched.getLongitudeDec())
                .withManufacturer(voiceStreamEnriched.getManufacturer())
                .withOSandVersion(voiceStreamEnriched.getOSandVersion())
                .withSignalingEndTime(epochToDateTime(voiceStreamEnriched.getSignalingEndTimeSecs()))
                .withDsSimplifiedCause(voiceStreamEnriched.getDsSimplifiedCause())
                .withDsFinalCauseStatus(voiceStreamEnriched.getDsFinalCauseStatus());

    }

}
