
package org.cem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cellRegion",
    "siteName",
    "latitudeDec",
    "longitudeDec"
})
public class SiteLocation {

    @JsonProperty("cellRegion")
    private String cellRegion = "";
    @JsonProperty("siteName")
    private String siteName = "";
    @JsonProperty("latitudeDec")
    private String latitudeDec = "";
    @JsonProperty("longitudeDec")
    private String longitudeDec = "";

    @JsonProperty("cellRegion")
    public String getCellRegion() {
        return cellRegion;
    }

    @JsonProperty("cellRegion")
    public void setCellRegion(String cellRegion) {
        this.cellRegion = cellRegion;
    }

    public SiteLocation withCellRegion(String cellRegion) {
        this.cellRegion = cellRegion;
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

    public SiteLocation withSiteName(String siteName) {
        this.siteName = siteName;
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

    public SiteLocation withLatitudeDec(String latitudeDec) {
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

    public SiteLocation withLongitudeDec(String longitudeDec) {
        this.longitudeDec = longitudeDec;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SiteLocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cellRegion");
        sb.append('=');
        sb.append(((this.cellRegion == null)?"<null>":this.cellRegion));
        sb.append(',');
        sb.append("siteName");
        sb.append('=');
        sb.append(((this.siteName == null)?"<null>":this.siteName));
        sb.append(',');
        sb.append("latitudeDec");
        sb.append('=');
        sb.append(((this.latitudeDec == null)?"<null>":this.latitudeDec));
        sb.append(',');
        sb.append("longitudeDec");
        sb.append('=');
        sb.append(((this.longitudeDec == null)?"<null>":this.longitudeDec));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
