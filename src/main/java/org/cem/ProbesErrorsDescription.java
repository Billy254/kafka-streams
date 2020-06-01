
package org.cem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dsCauseName1",
    "dsFinalCauseStatus",
    "dsSimplifiedCause"
})
public class ProbesErrorsDescription {

    @JsonProperty("dsCauseName1")
    private String dsCauseName1 = "";
    @JsonProperty("dsFinalCauseStatus")
    private String dsFinalCauseStatus = "";
    @JsonProperty("dsSimplifiedCause")
    private String dsSimplifiedCause = "";

    @JsonProperty("dsCauseName1")
    public String getDsCauseName1() {
        return dsCauseName1;
    }

    @JsonProperty("dsCauseName1")
    public void setDsCauseName1(String dsCauseName1) {
        this.dsCauseName1 = dsCauseName1;
    }

    public ProbesErrorsDescription withDsCauseName1(String dsCauseName1) {
        this.dsCauseName1 = dsCauseName1;
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

    public ProbesErrorsDescription withDsFinalCauseStatus(String dsFinalCauseStatus) {
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

    public ProbesErrorsDescription withDsSimplifiedCause(String dsSimplifiedCause) {
        this.dsSimplifiedCause = dsSimplifiedCause;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProbesErrorsDescription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dsCauseName1");
        sb.append('=');
        sb.append(((this.dsCauseName1 == null)?"<null>":this.dsCauseName1));
        sb.append(',');
        sb.append("dsFinalCauseStatus");
        sb.append('=');
        sb.append(((this.dsFinalCauseStatus == null)?"<null>":this.dsFinalCauseStatus));
        sb.append(',');
        sb.append("dsSimplifiedCause");
        sb.append('=');
        sb.append(((this.dsSimplifiedCause == null)?"<null>":this.dsSimplifiedCause));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
