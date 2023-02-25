package com.example.labb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.graphics.Color
import android.widget.Switch

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)


        val textViewJoke = findViewById<TextView>(R.id.text_view_joke)
        textViewJoke.text = "Fearing that the actions of Superman are left unchecked, Batman takes on the Man of Steel, while the world wrestles with what kind of a hero it really needs."
        textViewJoke.setOnTouchListener { _, event -> true }

        val switchBackground = findViewById<Switch>(R.id.switch_background)
        switchBackground.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                textViewJoke.setTextColor(Color.parseColor("#FF3333"))
            } else {
                textViewJoke.setTextColor(Color.parseColor("#3135B3"))
            }
        }
    }
}


