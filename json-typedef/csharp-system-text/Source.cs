// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Datasworn
{
    /// <summary>
    /// Metadata describing the original source of this item
    /// </summary>
    public class Source
    {
        [JsonPropertyName("authors")]
        public IList<SourceAuthor> Authors { get; set; }

        /// <summary>
        /// The date of the source documents's last update, formatted YYYY-MM-
        /// DD. Required because it's used to determine whether the data needs
        /// updating.
        /// </summary>
        [JsonPropertyName("date")]
        public string Date { get; set; }

        [JsonPropertyName("license")]
        public string License { get; set; }

        /// <summary>
        /// The title of the source document.
        /// </summary>
        [JsonPropertyName("title")]
        public string Title { get; set; }

        /// <summary>
        /// An absolute URL where the source document is available.
        /// </summary>
        [JsonPropertyName("url")]
        public string Url { get; set; }

        /// <summary>
        /// The page number where this item is described in full.
        /// </summary>
        [JsonPropertyName("page")]
        [JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)]
        public short? Page { get; set; }
    }
}