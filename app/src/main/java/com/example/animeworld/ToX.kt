package com.example.animeworld


import com.google.gson.annotations.SerializedName

data class ToX(
    @SerializedName("day")
    val day: Int,
    @SerializedName("month")
    val month: Int,
    @SerializedName("year")
    val year: Int
)