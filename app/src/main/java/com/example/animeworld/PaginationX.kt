package com.example.animeworld


import com.google.gson.annotations.SerializedName

data class PaginationX(
    @SerializedName("current_page")
    val currentPage: Int,
    @SerializedName("has_next_page")
    val hasNextPage: Boolean,
    @SerializedName("items")
    val items: ItemsX,
    @SerializedName("last_visible_page")
    val lastVisiblePage: Int
)