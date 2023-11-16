package com.example.animeworld


import com.google.gson.annotations.SerializedName

data class ImagesXXX(
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("large_image_url")
    val largeImageUrl: String,
    @SerializedName("maximum_image_url")
    val maximumImageUrl: String,
    @SerializedName("medium_image_url")
    val mediumImageUrl: String,
    @SerializedName("small_image_url")
    val smallImageUrl: String
)