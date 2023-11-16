package com.example.animeworld.service

import com.example.animeworld.SearchedAnime
import com.example.animeworld.TopAnime
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeService {
    //Here we configure the retrofit and write all the info about the url

    @GET("top/anime")
    fun getTopAnime(): Call<TopAnime>

    @GET("anime")
    fun getSearchedAnime(@Query("q")queryString: String): Call<SearchedAnime>


    companion object{
        val BASE_URL = "https://api.jikan.moe/v4/"

         //configure retrofit, so create function that return animeservice

        fun create(): AnimeService{
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(AnimeService::class.java)
        }
    }


}