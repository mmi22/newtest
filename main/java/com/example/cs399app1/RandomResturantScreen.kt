package com.example.cs399app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random_resturant_screen.*

class RandomResturantScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_resturant_screen)

        btnNah.setOnClickListener{
            val intent = Intent(this, ResturantInfoScreen::class.java)
            startActivity(intent)
        }

        btnYeah.setOnClickListener{
            val intent = Intent(this, ResturantInfoScreen::class.java)
            startActivity(intent)
        }
    }
}
