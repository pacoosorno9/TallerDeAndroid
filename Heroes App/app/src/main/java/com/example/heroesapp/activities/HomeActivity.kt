package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.CategoryAdapter
import com.example.heroesapp.adapters.HeroeAdapter
import com.example.heroesapp.adapters.RestaurantAdapter
import com.example.heroesapp.models.Category
import com.example.heroesapp.models.Heroe
import com.example.heroesapp.models.Restaurant
import com.example.heroesapp.models.User


class HomeActivity : AppCompatActivity() {
    lateinit var usernameTV : TextView
    lateinit var logoutBtn : ImageView
    lateinit var categoryRecyclerView : RecyclerView
    lateinit var restaurantRecyclerView: RecyclerView
    lateinit var heroeRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        usernameTV = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutBtn)
        categoryRecyclerView = findViewById(R.id.category_recycleview)
        restaurantRecyclerView = findViewById(R.id.restaurants_recyclerview)
        heroeRecyclerView = findViewById(R.id.best_heroe_recycleview)
        categoryRecyclerView.adapter = CategoryAdapter(Category.categories)
        categoryRecyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,false)

        restaurantRecyclerView.adapter = RestaurantAdapter(Restaurant.restaurants){ restaurant->
            Log.i("Restaurant desde Home", restaurant.name)
            val intent = Intent(this@HomeActivity,RestaurantActivity::class.java)
            intent.putExtra("restaurantId",restaurant.id)
            startActivity(intent)
        }
        restaurantRecyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,false)

        heroeRecyclerView.adapter = HeroeAdapter(Heroe.heroes){ heroe: Heroe ->
            val intent = Intent(this@HomeActivity,HeroeDetailsActivity::class.java)
            intent.putExtra("heroeId",heroe.id)
            startActivity(intent)
        }
        heroeRecyclerView.layoutManager = GridLayoutManager(this,2)

        val user = User.users[1]
        usernameTV.text = user.computedName
        logoutBtn.setOnClickListener {
            Log.i("LOGOUT","Cerrando sesion")
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}