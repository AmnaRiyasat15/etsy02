package com.example.etsyproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DealsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deals) // Set the layout for this activity

        // Initialize bottom navigation icons
        val homeIcon = findViewById<ImageView>(R.id.icon_home)
        val dealsIcon = findViewById<ImageView>(R.id.icon_deals) // You can also keep a reference to this if needed
        val favoritesIcon = findViewById<ImageView>(R.id.icon_fvrt)
        val cartIcon = findViewById<ImageView>(R.id.icon_cart)

        // Set up click listeners for navigation icons
        homeIcon.setOnClickListener {
            // Navigate back to HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Optional: Close DealsActivity if you don't want to return to it
        }

        favoritesIcon.setOnClickListener {
            // Navigate to FavoritesActivity (you need to create this activity)
            val intent = Intent(this, FavoritesActivity::class.java)
            startActivity(intent)
            finish() // Optional: Close DealsActivity
        }

        cartIcon.setOnClickListener {
            // Navigate to CartActivity (you need to create this activity)
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
            finish() // Optional: Close DealsActivity
        }

        // Note: If you want to keep the current DealsActivity open on clicking the Deals icon, you can omit the click listener for it
    }
}
