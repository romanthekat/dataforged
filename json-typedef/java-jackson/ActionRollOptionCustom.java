// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class ActionRollOptionCustom extends ActionRollOption {
    @JsonProperty("name")
    private Label name;

    @JsonProperty("value")
    private Short value;

    public ActionRollOptionCustom() {
    }

    /**
     * Getter for name.<p>
     */
    public Label getName() {
        return name;
    }

    /**
     * Setter for name.<p>
     */
    public void setName(Label name) {
        this.name = name;
    }

    /**
     * Getter for value.<p>
     */
    public Short getValue() {
        return value;
    }

    /**
     * Setter for value.<p>
     */
    public void setValue(Short value) {
        this.value = value;
    }
}