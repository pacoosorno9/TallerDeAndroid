package com.example.heroesapp.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroe
import com.squareup.picasso.Picasso

class HeroeDetailsActivity : AppCompatActivity() {
    lateinit var heroeTextView: TextView
    lateinit var heroePriceTextView: TextView
    lateinit var heroeDecriptionTextView: TextView
    lateinit var heroeImageView: ImageView
    lateinit var heroeRatingTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroe_details)
        heroeTextView = findViewById(R.id.heroe_title)
        heroeImageView = findViewById(R.id.heroe_image)
        heroePriceTextView = findViewById(R.id.heroe_price)
        heroeDecriptionTextView = findViewById(R.id.heroe_description)
        heroeRatingTextView = findViewById(R.id.heroe_rating)
        val heroeId = intent.getIntExtra("heroeId",0)

        val heroe = Heroe.heroes.firstOrNull { heroe: Heroe ->
            heroe.id == heroeId
        }

        heroeTextView.text = heroe?.name
        heroePriceTextView.text = heroe?.computedPrice
        heroeRatingTextView.text = heroe?.rating.toString()
        Picasso.get().load(heroe?.image).into(heroeImageView)
        heroeDecriptionTextView.text = heroe?.description
    }
}