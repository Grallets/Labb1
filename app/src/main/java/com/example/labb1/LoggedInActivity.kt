package com.example.labb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoggedInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)

        val username = intent.getStringExtra("username")
        val textViewUsername = findViewById<TextView>(R.id.text_view_username)
        textViewUsername.text = "Logged in as: $username"
    }
}
