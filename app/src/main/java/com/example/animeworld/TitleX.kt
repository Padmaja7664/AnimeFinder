package com.example.animeworld


import com.google.gson.annotations.SerializedName

data class TitleX(
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String
)