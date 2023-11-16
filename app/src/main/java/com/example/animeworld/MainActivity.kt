package com.example.animeworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.animeworld.databinding.ActivityMainBinding
import com.example.animeworld.service.AnimeService
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply{
             val animeService=AnimeService.create()
            //call the api
             val call =animeService.getTopAnime()
            //fetch the values
            call.enqueue(object: Callback<TopAnime>{

                //override the two functions onresponse and on failure
                //in response the actual value is fetched and then the value is passed using json convertor and we get values in the form of topanime
                override fun onResponse(call: Call<TopAnime>, response: Response<TopAnime>){
                   if(response.body() != null){
                       val top=response.body()!!.data
                       animeRecyclerView.adapter = AnimeAdapter(this@MainActivity,top)
                       animeRecyclerView.layoutManager=GridLayoutManager(this@MainActivity,3)

                   }
                }

                override fun onFailure(call: Call<TopAnime>, t: Throwable) {

                }

            })


            //to get the searched anime
            btnSearch.setOnClickListener {
                val searchedAnime=searchInputEditText.text.toString()
                val callSerachedAnime=animeService.getSearchedAnime(searchedAnime)


                callSerachedAnime.enqueue(object : Callback<SearchedAnime>{
                    override fun onResponse(
                        call: Call<SearchedAnime>,
                        response: Response<SearchedAnime>
                    ) {

                        if(response.body() != null){
                            val searchedAnime=response.body()!!.data

                            animeRecyclerView.adapter = AnimeAdapter(this@MainActivity,searchedAnime)
                            animeRecyclerView.layoutManager=GridLayoutManager(this@MainActivity,3)

                        }
                    }

                    override fun onFailure(call: Call<SearchedAnime>, t: Throwable) {

                    }
                })
            }
        }

    }


    //create an adapter
    class AnimeAdapter(
        private  val parentActivity :AppCompatActivity,
        private val animes:List<Data>
    ): RecyclerView.Adapter<AnimeAdapter.CustomViewHolder>(){


        inner class CustomViewHolder(view: View):RecyclerView.ViewHolder(view)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
            val view=LayoutInflater.from(parent.context).inflate(R.layout.anime_item_layout,parent,false)

            return CustomViewHolder(view)
        }

        override fun getItemCount(): Int {
           return animes.size
        }

        override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
            val anime=animes[position]
            val view =holder.itemView

            val name=view.findViewById<TextView>(R.id.name)
            val image=view.findViewById<ImageView>(R.id.image)

            name.text=anime.title

            Picasso.get().load(anime.images.webp.imageUrl).into(image)
           // Picasso.get()?.load(Webp.)?.into(image)

            view.setOnClickListener {
                AnimeDetailsBottomSheet(anime).apply{
                    show(parentActivity.supportFragmentManager,"AnimeDetailsBottomSheet")
                }
            }
        }

    }
}



