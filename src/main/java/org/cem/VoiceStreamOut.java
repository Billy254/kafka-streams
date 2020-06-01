
package org.cem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "callScenario",
    "technology",
    "callStartTime",
    "callDuration",
    "imsi",
    "msisdn",
    "callingMsisdn",
    "calledMsisdn",
    "imei",
    "cgi",
    "conAckTime",
    "releaseTime",
    "signalingEndTime",
    "pagingTimeStamp",
    "probeId",
    "siteName",
    "cellRegion",
    "latitudeDec",
    "longitudeDec",
    "dsFinalCauseStatus",
    "dsSimplifiedCause",
    "handsetName",
    "manufacturer",
    "OSandVersion"
})
public class VoiceStreamOut {

    @JsonProperty("id")
    private Object id;
    @JsonProperty("callScenario")
    private Object callScenario;
    @JsonProperty("technology")
    private String technology;
    @JsonProperty("callStartTime")
    private String callStartTime = "";
    @JsonProperty("callDuration")
    private Long callDuration = 0L;
    @JsonProperty("imsi")
    private String imsi = "";
    @JsonProperty("msisdn")
    private String msisdn = "";
    @JsonProperty("callingMsisdn")
    private String callingMsisdn = "";
    @JsonProperty("calledMsisdn")
    private String calledMsisdn = "";
    @JsonProperty("imei")
    private String imei = "";
    @JsonProperty("cgi")
    private String cgi = "";
    @JsonProperty("conAckTime")
    private String conAckTime = "";
    @JsonProperty("releaseTime")
    private String releaseTime = "";
    @JsonProperty("signalingEndTime")
    private String signalingEndTime = "";
    @JsonProperty("pagingTimeStamp")
    private String pagingTimeStamp = "";
    @JsonProperty("probeId")
    private String probeId = "";
    @JsonProperty("siteName")
    private String siteName = "";
    @JsonProperty("cellRegion")
    private String cellRegion = "";
    @JsonProperty("latitudeDec")
    private String latitudeDec = "";
    @JsonProperty("longitudeDec")
    private String longitudeDec = "";
    @JsonProperty("dsFinalCauseStatus")
    private String dsFinalCauseStatus = "";
    @JsonProperty("dsSimplifiedCause")
    private String dsSimplifiedCause = "";
    @JsonProperty("handsetName")
    private String handsetName = "";
    @JsonProperty("manufacturer")
    private String manufacturer = "";
    @JsonProperty("OSandVersion")
    private String oSandVersion = "";

    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public VoiceStreamOut withId(Object id) {
        this.id = id;
        return this;
    }

    @JsonProperty("callScenario")
    public Object getCallScenario() {
        return callScenario;
    }

    @JsonProperty("callScenario")
    public void setCallScenario(Object callScenario) {
        this.callScenario = callScenario;
    }

    public VoiceStreamOut withCallScenario(Object callScenario) {
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

    public VoiceStreamOut withTechnology(String technology) {
        this.technology = technology;
        return this;
    }

    @JsonProperty("callStartTime")
    public String getCallStartTime() {
        return callStartTime;
    }

    @JsonProperty("callStartTime")
    public void setCallStartTime(String callStartTime) {
        this.callStartTime = callStartTime;
    }

    public VoiceStreamOut withCallStartTime(String callStartTime) {
        this.callStartTime = callStartTime;
        return this;
    }

    @JsonProperty("callDuration")
    public Long getCallDuration() {
        return callDuration;
    }

    @JsonProperty("callDuration")
    public void setCallDuration(Long callDuration) {
        this.callDuration = callDuration;
    }

    public VoiceStreamOut withCallDuration(Long callDuration) {
        this.callDuration = callDuration;
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

    public VoiceStreamOut withImsi(String imsi) {
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

    public VoiceStreamOut withMsisdn(String msisdn) {
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

    public VoiceStreamOut withCallingMsisdn(String callingMsisdn) {
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

    public VoiceStreamOut withCalledMsisdn(String calledMsisdn) {
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

    public VoiceStreamOut withImei(String imei) {
        this.imei = imei;
        return this;
    }

    @JsonProperty("cgi")
    public String getCgi() {
        return cgi;
    }

    @JsonProperty("cgi")
    public void setCgi(String cgi) {
        this.cgi = cgi;
    }

    public VoiceStreamOut withCgi(String cgi) {
        this.cgi = cgi;
        return this;
    }

    @JsonProperty("conAckTime")
    public String getConAckTime() {
        return conAckTime;
    }

    @JsonProperty("conAckTime")
    public void setConAckTime(String conAckTime) {
        this.conAckTime = conAckTime;
    }

    public VoiceStreamOut withConAckTime(String conAckTime) {
        this.conAckTime = conAckTime;
        return this;
    }

    @JsonProperty("releaseTime")
    public String getReleaseTime() {
        return releaseTime;
    }

    @JsonProperty("releaseTime")
    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public VoiceStreamOut withReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }

    @JsonProperty("signalingEndTime")
    public String getSignalingEndTime() {
        return signalingEndTime;
    }

    @JsonProperty("signalingEndTime")
    public void setSignalingEndTime(String signalingEndTime) {
        this.signalingEndTime = signalingEndTime;
    }

    public VoiceStreamOut withSignalingEndTime(String signalingEndTime) {
        this.signalingEndTime = signalingEndTime;
        return this;
    }

    @JsonProperty("pagingTimeStamp")
    public String getPagingTimeStamp() {
        return pagingTimeStamp;
    }

    @JsonProperty("pagingTimeStamp")
    public void setPagingTimeStamp(String pagingTimeStamp) {
        this.pagingTimeStamp = pagingTimeStamp;
    }

    public VoiceStreamOut withPagingTimeStamp(String pagingTimeStamp) {
        this.pagingTimeStamp = pagingTimeStamp;
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

    public VoiceStreamOut withProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }

    @JsonProperty("siteName")
    public String getSiteName() {
        return siteName;
    }

    @JsonProperty("siteName")
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public VoiceStreamOut withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    @JsonProperty("cellRegion")
    public String getCellRegion() {
        return cellRegion;
    }

    @JsonProperty("cellRegion")
    public void setCellRegion(String cellRegion) {
        this.cellRegion = cellRegion;
    }

    public VoiceStreamOut withCellRegion(String cellRegion) {
        this.cellRegion = cellRegion;
        return this;
    }

    @JsonProperty("latitudeDec")
    public String getLatitudeDec() {
        return latitudeDec;
    }

    @JsonProperty("latitudeDec")
    public void setLatitudeDec(String latitudeDec) {
        this.latitudeDec = latitudeDec;
    }

    public VoiceStreamOut withLatitudeDec(String latitudeDec) {
        this.latitudeDec = latitudeDec;
        return this;
    }

    @JsonProperty("longitudeDec")
    public String getLongitudeDec() {
        return longitudeDec;
    }

    @JsonProperty("longitudeDec")
    public void setLongitudeDec(String longitudeDec) {
        this.longitudeDec = longitudeDec;
    }

    public VoiceStreamOut withLongitudeDec(String longitudeDec) {
        this.longitudeDec = longitudeDec;
        return this;
    }

    @JsonProperty("dsFinalCauseStatus")
    public String getDsFinalCauseStatus() {
        return dsFinalCauseStatus;
    }

    @JsonProperty("dsFinalCauseStatus")
    public void setDsFinalCauseStatus(String dsFinalCauseStatus) {
        this.dsFinalCauseStatus = dsFinalCauseStatus;
    }

    public VoiceStreamOut withDsFinalCauseStatus(String dsFinalCauseStatus) {
        this.dsFinalCauseStatus = dsFinalCauseStatus;
        return this;
    }

    @JsonProperty("dsSimplifiedCause")
    public String getDsSimplifiedCause() {
        return dsSimplifiedCause;
    }

    @JsonProperty("dsSimplifiedCause")
    public void setDsSimplifiedCause(String dsSimplifiedCause) {
        this.dsSimplifiedCause = dsSimplifiedCause;
    }

    public VoiceStreamOut withDsSimplifiedCause(String dsSimplifiedCause) {
        this.dsSimplifiedCause = dsSimplifiedCause;
        return this;
    }

    @JsonProperty("handsetName")
    public String getHandsetName() {
        return handsetName;
    }

    @JsonProperty("handsetName")
    public void setHandsetName(String handsetName) {
        this.handsetName = handsetName;
    }

    public VoiceStreamOut withHandsetName(String handsetName) {
        this.handsetName = handsetName;
        return this;
    }

    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public VoiceStreamOut withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    @JsonProperty("OSandVersion")
    public String getOSandVersion() {
        return oSandVersion;
    }

    @JsonProperty("OSandVersion")
    public void setOSandVersion(String oSandVersion) {
        this.oSandVersion = oSandVersion;
    }

    public VoiceStreamOut withOSandVersion(String oSandVersion) {
        this.oSandVersion = oSandVersion;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VoiceStreamOut.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("callScenario");
        sb.append('=');
        sb.append(((this.callScenario == null)?"<null>":this.callScenario));
        sb.append(',');
        sb.append("technology");
        sb.append('=');
        sb.append(((this.technology == null)?"<null>":this.technology));
        sb.append(',');
        sb.append("callStartTime");
        sb.append('=');
        sb.append(((this.callStartTime == null)?"<null>":this.callStartTime));
        sb.append(',');
        sb.append("callDuration");
        sb.append('=');
        sb.append(((this.callDuration == null)?"<null>":this.callDuration));
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
        sb.append("cgi");
        sb.append('=');
        sb.append(((this.cgi == null)?"<null>":this.cgi));
        sb.append(',');
        sb.append("conAckTime");
        sb.append('=');
        sb.append(((this.conAckTime == null)?"<null>":this.conAckTime));
        sb.append(',');
        sb.append("releaseTime");
        sb.append('=');
        sb.append(((this.releaseTime == null)?"<null>":this.releaseTime));
        sb.append(',');
        sb.append("signalingEndTime");
        sb.append('=');
        sb.append(((this.signalingEndTime == null)?"<null>":this.signalingEndTime));
        sb.append(',');
        sb.append("pagingTimeStamp");
        sb.append('=');
        sb.append(((this.pagingTimeStamp == null)?"<null>":this.pagingTimeStamp));
        sb.append(',');
        sb.append("probeId");
        sb.append('=');
        sb.append(((this.probeId == null)?"<null>":this.probeId));
        sb.append(',');
        sb.append("siteName");
        sb.append('=');
        sb.append(((this.siteName == null)?"<null>":this.siteName));
        sb.append(',');
        sb.append("cellRegion");
        sb.append('=');
        sb.append(((this.cellRegion == null)?"<null>":this.cellRegion));
        sb.append(',');
        sb.append("latitudeDec");
        sb.append('=');
        sb.append(((this.latitudeDec == null)?"<null>":this.latitudeDec));
        sb.append(',');
        sb.append("longitudeDec");
        sb.append('=');
        sb.append(((this.longitudeDec == null)?"<null>":this.longitudeDec));
        sb.append(',');
        sb.append("dsFinalCauseStatus");
        sb.append('=');
        sb.append(((this.dsFinalCauseStatus == null)?"<null>":this.dsFinalCauseStatus));
        sb.append(',');
        sb.append("dsSimplifiedCause");
        sb.append('=');
        sb.append(((this.dsSimplifiedCause == null)?"<null>":this.dsSimplifiedCause));
        sb.append(',');
        sb.append("handsetName");
        sb.append('=');
        sb.append(((this.handsetName == null)?"<null>":this.handsetName));
        sb.append(',');
        sb.append("manufacturer");
        sb.append('=');
        sb.append(((this.manufacturer == null)?"<null>":this.manufacturer));
        sb.append(',');
        sb.append("oSandVersion");
        sb.append('=');
        sb.append(((this.oSandVersion == null)?"<null>":this.oSandVersion));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
