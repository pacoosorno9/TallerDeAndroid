package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Movie
import com.squareup.picasso.Picasso

class MovieAdapter(val movieList : List<Movie>,
                        val onClick:(Movie)->Unit)
    : RecyclerView.Adapter<MovieViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item,parent,false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.count()
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.movieName.text = movie.name
        Picasso.get().load(movie.image).into(holder.movieImage)
        holder.itemView.setOnClickListener {
            onClick(movie)
        }
    }

}

class MovieViewHolder(view: View) : ViewHolder(view){
    val movieName : TextView = view.findViewById(R.id.movie_name)
    val movieImage : ImageView = view.findViewById(R.id.movie_image)
}