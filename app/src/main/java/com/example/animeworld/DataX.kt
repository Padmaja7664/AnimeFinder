package com.example.animeworld


import com.google.gson.annotations.SerializedName

data class DataX(
    @SerializedName("aired")
    val aired: AiredX,
    @SerializedName("airing")
    val airing: Boolean,
    @SerializedName("approved")
    val approved: Boolean,
    @SerializedName("background")
    val background: String,
    @SerializedName("broadcast")
    val broadcast: BroadcastX,
    @SerializedName("demographics")
    val demographics: List<DemographicX>,
    @SerializedName("duration")
    val duration: String,
    @SerializedName("episodes")
    val episodes: Int,
    @SerializedName("explicit_genres")
    val explicitGenres: List<Any>,
    @SerializedName("favorites")
    val favorites: Int,
    @SerializedName("genres")
    val genres: List<GenreX>,
    @SerializedName("images")
    val images: ImagesXX,
    @SerializedName("licensors")
    val licensors: List<LicensorX>,
    @SerializedName("mal_id")
    val malId: Int,
    @SerializedName("members")
    val members: Int,
    @SerializedName("popularity")
    val popularity: Int,
    @SerializedName("producers")
    val producers: List<ProducerX>,
    @SerializedName("rank")
    val rank: Int,
    @SerializedName("rating")
    val rating: String,
    @SerializedName("score")
    val score: Double,
    @SerializedName("scored_by")
    val scoredBy: Int,
    @SerializedName("season")
    val season: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("studios")
    val studios: List<StudioX>,
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("themes")
    val themes: List<ThemeX>,
    @SerializedName("title")
    val title: String,
    @SerializedName("title_english")
    val titleEnglish: String,
    @SerializedName("title_japanese")
    val titleJapanese: String,
    @SerializedName("title_synonyms")
    val titleSynonyms: List<String>,
    @SerializedName("titles")
    val titles: List<TitleX>,
    @SerializedName("trailer")
    val trailer: TrailerX,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("year")
    val year: Int
)