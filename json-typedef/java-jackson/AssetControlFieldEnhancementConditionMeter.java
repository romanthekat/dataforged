// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Some assets provide a special condition meter of their own. The most common
 * example is the health meters on companion assets. Asset condition meters
 * may also include their own controls, such as the checkboxes that Starforged
 * companion assets use to indicate they are "out of action".
 */
@JsonSerialize
public class AssetControlFieldEnhancementConditionMeter extends AssetControlFieldEnhancement {
    @JsonProperty("max")
    private Short max;

    public AssetControlFieldEnhancementConditionMeter() {
    }

    /**
     * Getter for max.<p>
     * The maximum value of this meter.
     */
    public Short getMax() {
        return max;
    }

    /**
     * Setter for max.<p>
     * The maximum value of this meter.
     */
    public void setMax(Short max) {
        this.max = max;
    }
}