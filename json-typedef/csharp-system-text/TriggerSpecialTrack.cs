// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    public class TriggerSpecialTrack
    {
        /// <summary>
        /// Specific conditions that qualify for this trigger.
        /// </summary>
        [JsonPropertyName("conditions")]
        public IList<TriggerSpecialTrackCondition> Conditions { get; set; }

        /// <summary>
        /// A markdown string containing the primary trigger text for this move.
        /// 
        /// Secondary trigger text (for specific stats or uses of an asset
        /// ability) may be described in individual trigger conditions.
        /// </summary>
        [JsonPropertyName("text")]
        public MarkdownString Text { get; set; }
    }
}
