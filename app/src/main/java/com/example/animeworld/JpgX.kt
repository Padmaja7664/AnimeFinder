package com.example.animeworld


import com.google.gson.annotations.SerializedName

data class JpgX(
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("large_image_url")
    val largeImageUrl: String,
    @SerializedName("small_image_url")
    val smallImageUrl: String
)