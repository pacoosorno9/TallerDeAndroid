package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroeAdapter
import com.example.heroesapp.models.Movie
import com.example.heroesapp.models.Heroe

class MovieActivity : AppCompatActivity() {
    lateinit var movieTitle : TextView
    lateinit var heroeRecyclerView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movie)
        movieTitle = findViewById(R.id.movie_title)
        heroeRecyclerView = findViewById(R.id.heroe_recyclerview)
        val movieId = intent.getIntExtra("movieId",0)
        Log.i("MovieActivity","El Id que me pasaron es: ${movieId}")

        val movie = Movie.movie.firstOrNull { movie ->
            movie.id == movieId
        }
        Log.i("MovieActivity",movie.toString())
        movieTitle.text = movie?.name
        val heroes = Heroe.heroes.filter { heroe ->
            heroe.movieId == movieId
        }
        Log.i("MovieActivity",heroes.toString())
        heroeRecyclerView.adapter = HeroeAdapter(heroes){ heroe->
            val intent = Intent(this@MovieActivity,HeroeDetailsActivity::class.java)
            intent.putExtra("heroeId",heroe.id)
            startActivity(intent)
        }
        heroeRecyclerView.layoutManager = GridLayoutManager(this,2)
    }
}