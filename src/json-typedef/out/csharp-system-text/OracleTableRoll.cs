// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Datasworn
{
    public class OracleTableRoll
    {
        /// <summary>
        /// The rulebook explicitly cautions *against* rolling all details
        /// at once, so rolling every referenced oracle automatically is not
        /// recommended. That said, some oracle results only provide useful
        /// information once a secondary roll occurs, such as "Action + Theme".
        /// If this value is omitted, assume it's false.
        /// </summary>
        [JsonPropertyName("auto")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public bool? Auto { get; set; }

        [JsonPropertyName("method")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public OracleTableRollMethod? Method { get; set; }

        /// <summary>
        /// The ID of the oracle table to be rolled. If omitted, it defaults to
        /// the ID of this oracle table.
        /// </summary>
        [JsonPropertyName("oracle")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public OracleTableId? Oracle { get; set; }

        [JsonPropertyName("times")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public short? Times { get; set; }
    }
}
