package com.example.animeworld


import com.google.gson.annotations.SerializedName

data class AiredX(
    @SerializedName("from")
    val from: String,
    @SerializedName("prop")
    val prop: PropX,
    @SerializedName("string")
    val string: String,
    @SerializedName("to")
    val to: String
)