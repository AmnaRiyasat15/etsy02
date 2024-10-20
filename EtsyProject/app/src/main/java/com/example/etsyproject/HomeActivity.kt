package com.example.etsyproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Set click listeners for navigation icons
        val homeIcon = findViewById<ImageView>(R.id.icon_home)
        val dealsIcon = findViewById<ImageView>(R.id.icon_deals)
        val giftsIcon = findViewById<ImageView>(R.id.icon_gifts)
        val favoritesIcon = findViewById<ImageView>(R.id.icon_favorites)
        val cartIcon = findViewById<ImageView>(R.id.icon_cart)

        homeIcon.setOnClickListener {
            // Navigate to HomeActivity (or stay in the same screen)
        }

        dealsIcon.setOnClickListener {
            val intent = Intent(this, DealsActivity::class.java)
            startActivity(intent)
        }

        // Add similar click listeners for gifts, favorites, and cart if needed
    }
}
