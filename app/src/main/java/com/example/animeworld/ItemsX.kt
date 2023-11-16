package com.example.animeworld


import com.google.gson.annotations.SerializedName

data class ItemsX(
    @SerializedName("count")
    val count: Int,
    @SerializedName("per_page")
    val perPage: Int,
    @SerializedName("total")
    val total: Int
)