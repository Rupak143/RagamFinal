package com.example.ragam

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class StudentLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val titleText = findViewById<TextView>(R.id.signin_title)
        titleText.text = "Student Login"

        val email = findViewById<EditText>(R.id.email_input)
        val password = findViewById<EditText>(R.id.password_input)
        val signInBtn = findViewById<Button>(R.id.signin_button)
        val signupLink = findViewById<TextView>(R.id.signup_here)

        signInBtn.setOnClickListener {
            // TODO: Add real auth logic
            Toast.makeText(this, "Student logged in!", Toast.LENGTH_SHORT).show()
        }

        signupLink.setOnClickListener {
            startActivity(Intent(this, StudentSignupActivity::class.java))
        }
    }
}
