
package org.cem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "handsetName",
    "manufacturer",
    "operatingSystem",
    "osVersion",
    "capability"
})
public class DeviceInformation {

    @JsonProperty("handsetName")
    private String handsetName = "";
    @JsonProperty("manufacturer")
    private String manufacturer = "";
    @JsonProperty("operatingSystem")
    private String operatingSystem = "";
    @JsonProperty("osVersion")
    private String osVersion = "";
    @JsonProperty("capability")
    private String capability = "";

    @JsonProperty("handsetName")
    public String getHandsetName() {
        return handsetName;
    }

    @JsonProperty("handsetName")
    public void setHandsetName(String handsetName) {
        this.handsetName = handsetName;
    }

    public DeviceInformation withHandsetName(String handsetName) {
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

    public DeviceInformation withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    @JsonProperty("operatingSystem")
    public String getOperatingSystem() {
        return operatingSystem;
    }

    @JsonProperty("operatingSystem")
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public DeviceInformation withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @JsonProperty("osVersion")
    public String getOsVersion() {
        return osVersion;
    }

    @JsonProperty("osVersion")
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public DeviceInformation withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    @JsonProperty("capability")
    public String getCapability() {
        return capability;
    }

    @JsonProperty("capability")
    public void setCapability(String capability) {
        this.capability = capability;
    }

    public DeviceInformation withCapability(String capability) {
        this.capability = capability;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeviceInformation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("handsetName");
        sb.append('=');
        sb.append(((this.handsetName == null)?"<null>":this.handsetName));
        sb.append(',');
        sb.append("manufacturer");
        sb.append('=');
        sb.append(((this.manufacturer == null)?"<null>":this.manufacturer));
        sb.append(',');
        sb.append("operatingSystem");
        sb.append('=');
        sb.append(((this.operatingSystem == null)?"<null>":this.operatingSystem));
        sb.append(',');
        sb.append("osVersion");
        sb.append('=');
        sb.append(((this.osVersion == null)?"<null>":this.osVersion));
        sb.append(',');
        sb.append("capability");
        sb.append('=');
        sb.append(((this.capability == null)?"<null>":this.capability));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
