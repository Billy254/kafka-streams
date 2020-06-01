
package org.cem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "callScenario",
    "technology",
    "streamType",
    "callStartTimeSecs",
    "callStartTimeUsecs",
    "imsi",
    "msisdn",
    "callingMsisdn",
    "calledMsisdn",
    "imei",
    "sac",
    "lac",
    "dtapCcCause",
    "dtapMmCause",
    "dtapRrCause",
    "ranapCause",
    "conAckTimeSecs",
    "conAckTimeUsecs",
    "releaseTimeSecs",
    "releaseTimeUsecs",
    "callingNumberType",
    "calledNumberType",
    "signalingEndTimeSecs",
    "signalingEndTimeUsecs",
    "pagingTimeStampSecs",
    "pagingTimeStampUsecs",
    "probeId"
})
public class VoiceStream {

    @JsonProperty("callScenario")
    private Integer callScenario;
    @JsonProperty("technology")
    private String technology;
    @JsonProperty("streamType")
    private String streamType;
    @JsonProperty("callStartTimeSecs")
    private Long callStartTimeSecs = 0L;
    @JsonProperty("callStartTimeUsecs")
    private Long callStartTimeUsecs = 0L;
    @JsonProperty("imsi")
    private String imsi;
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("callingMsisdn")
    private String callingMsisdn;
    @JsonProperty("calledMsisdn")
    private String calledMsisdn;
    @JsonProperty("imei")
    private String imei;
    @JsonProperty("sac")
    private String sac;
    @JsonProperty("lac")
    private String lac;
    @JsonProperty("dtapCcCause")
    private String dtapCcCause;
    @JsonProperty("dtapMmCause")
    private String dtapMmCause;
    @JsonProperty("dtapRrCause")
    private String dtapRrCause;
    @JsonProperty("ranapCause")
    private String ranapCause;
    @JsonProperty("conAckTimeSecs")
    private Long conAckTimeSecs = 0L;
    @JsonProperty("conAckTimeUsecs")
    private Long conAckTimeUsecs = 0L;
    @JsonProperty("releaseTimeSecs")
    private Long releaseTimeSecs = 0L;
    @JsonProperty("releaseTimeUsecs")
    private Long releaseTimeUsecs = 0L;
    @JsonProperty("callingNumberType")
    private String callingNumberType;
    @JsonProperty("calledNumberType")
    private String calledNumberType;
    @JsonProperty("signalingEndTimeSecs")
    private Long signalingEndTimeSecs = 0L;
    @JsonProperty("signalingEndTimeUsecs")
    private Long signalingEndTimeUsecs = 0L;
    @JsonProperty("pagingTimeStampSecs")
    private Long pagingTimeStampSecs = 0L;
    @JsonProperty("pagingTimeStampUsecs")
    private Long pagingTimeStampUsecs = 0L;
    @JsonProperty("probeId")
    private String probeId;

    @JsonProperty("callScenario")
    public Integer getCallScenario() {
        return callScenario;
    }

    @JsonProperty("callScenario")
    public void setCallScenario(Integer callScenario) {
        this.callScenario = callScenario;
    }

    public VoiceStream withCallScenario(Integer callScenario) {
        this.callScenario = callScenario;
        return this;
    }

    @JsonProperty("technology")
    public String getTechnology() {
        return technology;
    }

    @JsonProperty("technology")
    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public VoiceStream withTechnology(String technology) {
        this.technology = technology;
        return this;
    }

    @JsonProperty("streamType")
    public String getStreamType() {
        return streamType;
    }

    @JsonProperty("streamType")
    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    public VoiceStream withStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }

    @JsonProperty("callStartTimeSecs")
    public Long getCallStartTimeSecs() {
        return callStartTimeSecs;
    }

    @JsonProperty("callStartTimeSecs")
    public void setCallStartTimeSecs(Long callStartTimeSecs) {
        this.callStartTimeSecs = callStartTimeSecs;
    }

    public VoiceStream withCallStartTimeSecs(Long callStartTimeSecs) {
        this.callStartTimeSecs = callStartTimeSecs;
        return this;
    }

    @JsonProperty("callStartTimeUsecs")
    public Long getCallStartTimeUsecs() {
        return callStartTimeUsecs;
    }

    @JsonProperty("callStartTimeUsecs")
    public void setCallStartTimeUsecs(Long callStartTimeUsecs) {
        this.callStartTimeUsecs = callStartTimeUsecs;
    }

    public VoiceStream withCallStartTimeUsecs(Long callStartTimeUsecs) {
        this.callStartTimeUsecs = callStartTimeUsecs;
        return this;
    }

    @JsonProperty("imsi")
    public String getImsi() {
        return imsi;
    }

    @JsonProperty("imsi")
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public VoiceStream withImsi(String imsi) {
        this.imsi = imsi;
        return this;
    }

    @JsonProperty("msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    @JsonProperty("msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public VoiceStream withMsisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }

    @JsonProperty("callingMsisdn")
    public String getCallingMsisdn() {
        return callingMsisdn;
    }

    @JsonProperty("callingMsisdn")
    public void setCallingMsisdn(String callingMsisdn) {
        this.callingMsisdn = callingMsisdn;
    }

    public VoiceStream withCallingMsisdn(String callingMsisdn) {
        this.callingMsisdn = callingMsisdn;
        return this;
    }

    @JsonProperty("calledMsisdn")
    public String getCalledMsisdn() {
        return calledMsisdn;
    }

    @JsonProperty("calledMsisdn")
    public void setCalledMsisdn(String calledMsisdn) {
        this.calledMsisdn = calledMsisdn;
    }

    public VoiceStream withCalledMsisdn(String calledMsisdn) {
        this.calledMsisdn = calledMsisdn;
        return this;
    }

    @JsonProperty("imei")
    public String getImei() {
        return imei;
    }

    @JsonProperty("imei")
    public void setImei(String imei) {
        this.imei = imei;
    }

    public VoiceStream withImei(String imei) {
        this.imei = imei;
        return this;
    }

    @JsonProperty("sac")
    public String getSac() {
        return sac;
    }

    @JsonProperty("sac")
    public void setSac(String sac) {
        this.sac = sac;
    }

    public VoiceStream withSac(String sac) {
        this.sac = sac;
        return this;
    }

    @JsonProperty("lac")
    public String getLac() {
        return lac;
    }

    @JsonProperty("lac")
    public void setLac(String lac) {
        this.lac = lac;
    }

    public VoiceStream withLac(String lac) {
        this.lac = lac;
        return this;
    }

    @JsonProperty("dtapCcCause")
    public String getDtapCcCause() {
        return dtapCcCause;
    }

    @JsonProperty("dtapCcCause")
    public void setDtapCcCause(String dtapCcCause) {
        this.dtapCcCause = dtapCcCause;
    }

    public VoiceStream withDtapCcCause(String dtapCcCause) {
        this.dtapCcCause = dtapCcCause;
        return this;
    }

    @JsonProperty("dtapMmCause")
    public String getDtapMmCause() {
        return dtapMmCause;
    }

    @JsonProperty("dtapMmCause")
    public void setDtapMmCause(String dtapMmCause) {
        this.dtapMmCause = dtapMmCause;
    }

    public VoiceStream withDtapMmCause(String dtapMmCause) {
        this.dtapMmCause = dtapMmCause;
        return this;
    }

    @JsonProperty("dtapRrCause")
    public String getDtapRrCause() {
        return dtapRrCause;
    }

    @JsonProperty("dtapRrCause")
    public void setDtapRrCause(String dtapRrCause) {
        this.dtapRrCause = dtapRrCause;
    }

    public VoiceStream withDtapRrCause(String dtapRrCause) {
        this.dtapRrCause = dtapRrCause;
        return this;
    }

    @JsonProperty("ranapCause")
    public String getRanapCause() {
        return ranapCause;
    }

    @JsonProperty("ranapCause")
    public void setRanapCause(String ranapCause) {
        this.ranapCause = ranapCause;
    }

    public VoiceStream withRanapCause(String ranapCause) {
        this.ranapCause = ranapCause;
        return this;
    }

    @JsonProperty("conAckTimeSecs")
    public Long getConAckTimeSecs() {
        return conAckTimeSecs;
    }

    @JsonProperty("conAckTimeSecs")
    public void setConAckTimeSecs(Long conAckTimeSecs) {
        this.conAckTimeSecs = conAckTimeSecs;
    }

    public VoiceStream withConAckTimeSecs(Long conAckTimeSecs) {
        this.conAckTimeSecs = conAckTimeSecs;
        return this;
    }

    @JsonProperty("conAckTimeUsecs")
    public Long getConAckTimeUsecs() {
        return conAckTimeUsecs;
    }

    @JsonProperty("conAckTimeUsecs")
    public void setConAckTimeUsecs(Long conAckTimeUsecs) {
        this.conAckTimeUsecs = conAckTimeUsecs;
    }

    public VoiceStream withConAckTimeUsecs(Long conAckTimeUsecs) {
        this.conAckTimeUsecs = conAckTimeUsecs;
        return this;
    }

    @JsonProperty("releaseTimeSecs")
    public Long getReleaseTimeSecs() {
        return releaseTimeSecs;
    }

    @JsonProperty("releaseTimeSecs")
    public void setReleaseTimeSecs(Long releaseTimeSecs) {
        this.releaseTimeSecs = releaseTimeSecs;
    }

    public VoiceStream withReleaseTimeSecs(Long releaseTimeSecs) {
        this.releaseTimeSecs = releaseTimeSecs;
        return this;
    }

    @JsonProperty("releaseTimeUsecs")
    public Long getReleaseTimeUsecs() {
        return releaseTimeUsecs;
    }

    @JsonProperty("releaseTimeUsecs")
    public void setReleaseTimeUsecs(Long releaseTimeUsecs) {
        this.releaseTimeUsecs = releaseTimeUsecs;
    }

    public VoiceStream withReleaseTimeUsecs(Long releaseTimeUsecs) {
        this.releaseTimeUsecs = releaseTimeUsecs;
        return this;
    }

    @JsonProperty("callingNumberType")
    public String getCallingNumberType() {
        return callingNumberType;
    }

    @JsonProperty("callingNumberType")
    public void setCallingNumberType(String callingNumberType) {
        this.callingNumberType = callingNumberType;
    }

    public VoiceStream withCallingNumberType(String callingNumberType) {
        this.callingNumberType = callingNumberType;
        return this;
    }

    @JsonProperty("calledNumberType")
    public String getCalledNumberType() {
        return calledNumberType;
    }

    @JsonProperty("calledNumberType")
    public void setCalledNumberType(String calledNumberType) {
        this.calledNumberType = calledNumberType;
    }

    public VoiceStream withCalledNumberType(String calledNumberType) {
        this.calledNumberType = calledNumberType;
        return this;
    }

    @JsonProperty("signalingEndTimeSecs")
    public Long getSignalingEndTimeSecs() {
        return signalingEndTimeSecs;
    }

    @JsonProperty("signalingEndTimeSecs")
    public void setSignalingEndTimeSecs(Long signalingEndTimeSecs) {
        this.signalingEndTimeSecs = signalingEndTimeSecs;
    }

    public VoiceStream withSignalingEndTimeSecs(Long signalingEndTimeSecs) {
        this.signalingEndTimeSecs = signalingEndTimeSecs;
        return this;
    }

    @JsonProperty("signalingEndTimeUsecs")
    public Long getSignalingEndTimeUsecs() {
        return signalingEndTimeUsecs;
    }

    @JsonProperty("signalingEndTimeUsecs")
    public void setSignalingEndTimeUsecs(Long signalingEndTimeUsecs) {
        this.signalingEndTimeUsecs = signalingEndTimeUsecs;
    }

    public VoiceStream withSignalingEndTimeUsecs(Long signalingEndTimeUsecs) {
        this.signalingEndTimeUsecs = signalingEndTimeUsecs;
        return this;
    }

    @JsonProperty("pagingTimeStampSecs")
    public Long getPagingTimeStampSecs() {
        return pagingTimeStampSecs;
    }

    @JsonProperty("pagingTimeStampSecs")
    public void setPagingTimeStampSecs(Long pagingTimeStampSecs) {
        this.pagingTimeStampSecs = pagingTimeStampSecs;
    }

    public VoiceStream withPagingTimeStampSecs(Long pagingTimeStampSecs) {
        this.pagingTimeStampSecs = pagingTimeStampSecs;
        return this;
    }

    @JsonProperty("pagingTimeStampUsecs")
    public Long getPagingTimeStampUsecs() {
        return pagingTimeStampUsecs;
    }

    @JsonProperty("pagingTimeStampUsecs")
    public void setPagingTimeStampUsecs(Long pagingTimeStampUsecs) {
        this.pagingTimeStampUsecs = pagingTimeStampUsecs;
    }

    public VoiceStream withPagingTimeStampUsecs(Long pagingTimeStampUsecs) {
        this.pagingTimeStampUsecs = pagingTimeStampUsecs;
        return this;
    }

    @JsonProperty("probeId")
    public String getProbeId() {
        return probeId;
    }

    @JsonProperty("probeId")
    public void setProbeId(String probeId) {
        this.probeId = probeId;
    }

    public VoiceStream withProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VoiceStream.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("callScenario");
        sb.append('=');
        sb.append(((this.callScenario == null)?"<null>":this.callScenario));
        sb.append(',');
        sb.append("technology");
        sb.append('=');
        sb.append(((this.technology == null)?"<null>":this.technology));
        sb.append(',');
        sb.append("streamType");
        sb.append('=');
        sb.append(((this.streamType == null)?"<null>":this.streamType));
        sb.append(',');
        sb.append("callStartTimeSecs");
        sb.append('=');
        sb.append(((this.callStartTimeSecs == null)?"<null>":this.callStartTimeSecs));
        sb.append(',');
        sb.append("callStartTimeUsecs");
        sb.append('=');
        sb.append(((this.callStartTimeUsecs == null)?"<null>":this.callStartTimeUsecs));
        sb.append(',');
        sb.append("imsi");
        sb.append('=');
        sb.append(((this.imsi == null)?"<null>":this.imsi));
        sb.append(',');
        sb.append("msisdn");
        sb.append('=');
        sb.append(((this.msisdn == null)?"<null>":this.msisdn));
        sb.append(',');
        sb.append("callingMsisdn");
        sb.append('=');
        sb.append(((this.callingMsisdn == null)?"<null>":this.callingMsisdn));
        sb.append(',');
        sb.append("calledMsisdn");
        sb.append('=');
        sb.append(((this.calledMsisdn == null)?"<null>":this.calledMsisdn));
        sb.append(',');
        sb.append("imei");
        sb.append('=');
        sb.append(((this.imei == null)?"<null>":this.imei));
        sb.append(',');
        sb.append("sac");
        sb.append('=');
        sb.append(((this.sac == null)?"<null>":this.sac));
        sb.append(',');
        sb.append("lac");
        sb.append('=');
        sb.append(((this.lac == null)?"<null>":this.lac));
        sb.append(',');
        sb.append("dtapCcCause");
        sb.append('=');
        sb.append(((this.dtapCcCause == null)?"<null>":this.dtapCcCause));
        sb.append(',');
        sb.append("dtapMmCause");
        sb.append('=');
        sb.append(((this.dtapMmCause == null)?"<null>":this.dtapMmCause));
        sb.append(',');
        sb.append("dtapRrCause");
        sb.append('=');
        sb.append(((this.dtapRrCause == null)?"<null>":this.dtapRrCause));
        sb.append(',');
        sb.append("ranapCause");
        sb.append('=');
        sb.append(((this.ranapCause == null)?"<null>":this.ranapCause));
        sb.append(',');
        sb.append("conAckTimeSecs");
        sb.append('=');
        sb.append(((this.conAckTimeSecs == null)?"<null>":this.conAckTimeSecs));
        sb.append(',');
        sb.append("conAckTimeUsecs");
        sb.append('=');
        sb.append(((this.conAckTimeUsecs == null)?"<null>":this.conAckTimeUsecs));
        sb.append(',');
        sb.append("releaseTimeSecs");
        sb.append('=');
        sb.append(((this.releaseTimeSecs == null)?"<null>":this.releaseTimeSecs));
        sb.append(',');
        sb.append("releaseTimeUsecs");
        sb.append('=');
        sb.append(((this.releaseTimeUsecs == null)?"<null>":this.releaseTimeUsecs));
        sb.append(',');
        sb.append("callingNumberType");
        sb.append('=');
        sb.append(((this.callingNumberType == null)?"<null>":this.callingNumberType));
        sb.append(',');
        sb.append("calledNumberType");
        sb.append('=');
        sb.append(((this.calledNumberType == null)?"<null>":this.calledNumberType));
        sb.append(',');
        sb.append("signalingEndTimeSecs");
        sb.append('=');
        sb.append(((this.signalingEndTimeSecs == null)?"<null>":this.signalingEndTimeSecs));
        sb.append(',');
        sb.append("signalingEndTimeUsecs");
        sb.append('=');
        sb.append(((this.signalingEndTimeUsecs == null)?"<null>":this.signalingEndTimeUsecs));
        sb.append(',');
        sb.append("pagingTimeStampSecs");
        sb.append('=');
        sb.append(((this.pagingTimeStampSecs == null)?"<null>":this.pagingTimeStampSecs));
        sb.append(',');
        sb.append("pagingTimeStampUsecs");
        sb.append('=');
        sb.append(((this.pagingTimeStampUsecs == null)?"<null>":this.pagingTimeStampUsecs));
        sb.append(',');
        sb.append("probeId");
        sb.append('=');
        sb.append(((this.probeId == null)?"<null>":this.probeId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
