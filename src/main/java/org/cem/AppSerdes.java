package org.cem;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;


import java.util.HashMap;
import java.util.Map;

public class AppSerdes extends Serdes {

    // Voice stream serde
    static public final class VoiceStreamSerde extends WrapperSerde<VoiceStream> {
        public VoiceStreamSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }
    static public Serde<VoiceStream> VoiceStream() {
        VoiceStreamSerde serde =  new VoiceStreamSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, VoiceStream.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    //Site location serdes
    static public final class SiteLocationSerde extends WrapperSerde<SiteLocation> {
        public SiteLocationSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }
    static public Serde<SiteLocation> SiteLocation() {
        SiteLocationSerde serde =  new SiteLocationSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, SiteLocation.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    //Error codes serdes
    static public final class ProbesErrorsDescriptionSerde extends WrapperSerde<ProbesErrorsDescription> {
        public ProbesErrorsDescriptionSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }
    static public Serde<ProbesErrorsDescription> ProbesErrorsDescription() {
        ProbesErrorsDescriptionSerde serde =  new ProbesErrorsDescriptionSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, ProbesErrorsDescription.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    //Enriched kstream serde
    static public final class VoiceStreamEnrichedSerde extends WrapperSerde<VoiceStreamEnriched> {
        public VoiceStreamEnrichedSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }
    static public Serde<VoiceStreamEnriched> VoiceStreamEnriched() {
        VoiceStreamEnrichedSerde serde =  new VoiceStreamEnrichedSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, VoiceStreamEnriched.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    //Device information serde
    static public final class DeviceInformationSerde extends WrapperSerde<DeviceInformation> {
        public DeviceInformationSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }
    static public Serde<DeviceInformation> DeviceInformation() {
        DeviceInformationSerde serde =  new DeviceInformationSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, DeviceInformation.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    // Final stream serde
    static public final class VoiceStreamOutSerde extends WrapperSerde<VoiceStreamOut> {
        public VoiceStreamOutSerde() {
            super(new JsonSerializer<>(), new JsonDeserializer<>());
        }
    }
    static public Serde<VoiceStreamOut> VoiceStreamOut() {
        VoiceStreamOutSerde serde =  new VoiceStreamOutSerde();

        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put(JsonDeserializer.VALUE_CLASS_NAME_CONFIG, VoiceStreamOut.class);
        serde.configure(serdeConfigs, false);

        return serde;
    }

}
