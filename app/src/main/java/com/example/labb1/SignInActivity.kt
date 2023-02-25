package com.example.labb1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val editTextUsername = findViewById<EditText>(R.id.edit_text_username)
        val buttonSignIn = findViewById<Button>(R.id.button_sign_in)
        buttonSignIn.setOnClickListener {
            val username = editTextUsername.text.toString().trim()
            if (username.isNotEmpty()) {
                if (username.equals("Kristoffer", ignoreCase = true) || username.equals("Granit", ignoreCase = true)) {
                    val intent = Intent(this, LoggedInActivity::class.java)
                    intent.putExtra("username", username)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "This username is incorrect. Please try again.", Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}
