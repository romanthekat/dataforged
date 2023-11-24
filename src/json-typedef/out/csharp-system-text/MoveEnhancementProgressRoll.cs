// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    public class MoveEnhancementProgressRoll : MoveEnhancement
    {
        [JsonPropertyName("roll_type")]
        public string RollType { get => "progress_roll"; }

        [JsonPropertyName("enhances")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public IList<MoveIdwildcard> Enhances { get; set; }

        [JsonPropertyName("trigger")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public TriggerProgressRollEnhancement? Trigger { get; set; }
    }
}
