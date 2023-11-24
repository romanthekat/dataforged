// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    /// <summary>
    /// Some assets provide a special condition meter of their own. The most
    /// common example is the health meters on companion assets. Asset condition
    /// meters may also include their own controls, such as the checkboxes that
    /// Starforged companion assets use to indicate they are "out of action".
    /// </summary>
    public class AssetControlFieldConditionMeter : AssetControlField
    {
        [JsonPropertyName("field_type")]
        public string FieldType { get => "condition_meter"; }

        [JsonPropertyName("id")]
        public AssetControlFieldId Id { get; set; }

        /// <summary>
        /// The maximum value of this meter.
        /// </summary>
        [JsonPropertyName("max")]
        public short Max { get; set; }

        /// <summary>
        /// The minimum value of this meter.
        /// </summary>
        [JsonPropertyName("min")]
        public byte Min { get; set; }

        /// <summary>
        /// A label for this input. In some contexts it may be undesirable
        /// to render this text, but it should always be exposed to assistive
        /// technology (e.g. with `aria-label` in HTML).
        /// </summary>
        [JsonPropertyName("name")]
        public Label Name { get; set; }

        /// <summary>
        /// The current value of this meter.
        /// </summary>
        [JsonPropertyName("value")]
        public short Value { get; set; }

        [JsonPropertyName("controls")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IDictionary<string, AssetConditionMeterControlField> Controls { get; set; }

        /// <summary>
        /// Provides hints for moves that interact with this condition meter,
        /// such as suffer and recovery moves.
        /// </summary>
        [JsonPropertyName("moves")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public AssetControlFieldConditionMeterMoves Moves { get; set; }
    }
}