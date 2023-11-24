// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * A clock with 4, 6, 8, or 10 segments.
 */
@JsonSerialize
public class AssetAbilityControlFieldClock extends AssetAbilityControlField {
    @JsonProperty("id")
    private AssetAbilityControlFieldId id;

    @JsonProperty("max")
    private UnsignedByte max;

    @JsonProperty("min")
    private UnsignedByte min;

    @JsonProperty("name")
    private Label name;

    @JsonProperty("value")
    private Short value;

    public AssetAbilityControlFieldClock() {
    }

    /**
     * Getter for id.<p>
     */
    public AssetAbilityControlFieldId getId() {
        return id;
    }

    /**
     * Setter for id.<p>
     */
    public void setId(AssetAbilityControlFieldId id) {
        this.id = id;
    }

    /**
     * Getter for max.<p>
     * The size of the clock -- in other words, the maximum number of filled
     * clock segments.
     */
    public UnsignedByte getMax() {
        return max;
    }

    /**
     * Setter for max.<p>
     * The size of the clock -- in other words, the maximum number of filled
     * clock segments.
     */
    public void setMax(UnsignedByte max) {
        this.max = max;
    }

    /**
     * Getter for min.<p>
     * The minimum number of filled clock segments. This is always 0.
     */
    public UnsignedByte getMin() {
        return min;
    }

    /**
     * Setter for min.<p>
     * The minimum number of filled clock segments. This is always 0.
     */
    public void setMin(UnsignedByte min) {
        this.min = min;
    }

    /**
     * Getter for name.<p>
     * A label for this input. In some contexts it may be undesirable to render
     * this text, but it should always be exposed to assistive technology (e.g.
     * with `aria-label` in HTML).
     */
    public Label getName() {
        return name;
    }

    /**
     * Setter for name.<p>
     * A label for this input. In some contexts it may be undesirable to render
     * this text, but it should always be exposed to assistive technology (e.g.
     * with `aria-label` in HTML).
     */
    public void setName(Label name) {
        this.name = name;
    }

    /**
     * Getter for value.<p>
     * The current number of filled clock segments.
     */
    public Short getValue() {
        return value;
    }

    /**
     * Setter for value.<p>
     * The current number of filled clock segments.
     */
    public void setValue(Short value) {
        this.value = value;
    }
}