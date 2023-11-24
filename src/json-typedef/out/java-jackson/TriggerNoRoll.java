// Code generated by jtd-codegen for Java + Jackson v0.2.1

package Datasworn;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

@JsonSerialize
public class TriggerNoRoll {
    @JsonProperty("conditions")
    private List<TriggerNoRollCondition> conditions;

    @JsonProperty("text")
    private MarkdownString text;

    public TriggerNoRoll() {
    }

    /**
     * Getter for conditions.<p>
     */
    public List<TriggerNoRollCondition> getConditions() {
        return conditions;
    }

    /**
     * Setter for conditions.<p>
     */
    public void setConditions(List<TriggerNoRollCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * Getter for text.<p>
     * A markdown string containing the primary trigger text for this move.
     * 
     * Secondary trigger text (for specific stats or uses of an asset ability)
     * may be described in individual trigger conditions.
     */
    public MarkdownString getText() {
        return text;
    }

    /**
     * Setter for text.<p>
     * A markdown string containing the primary trigger text for this move.
     * 
     * Secondary trigger text (for specific stats or uses of an asset ability)
     * may be described in individual trigger conditions.
     */
    public void setText(MarkdownString text) {
        this.text = text;
    }
}
