package com.example.ragam

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Get view references
        val firstName = findViewById<EditText>(R.id.firstName)
        val email = findViewById<EditText>(R.id.email)
        val phoneNumber = findViewById<EditText>(R.id.phoneNumber)
        val gender = findViewById<EditText>(R.id.gender)
        val dob = findViewById<EditText>(R.id.dob)
        val password = findViewById<EditText>(R.id.password)
        val confirmPassword = findViewById<EditText>(R.id.confirmPassword)
        val signUpButton = findViewById<Button>(R.id.signupButton)

        signUpButton.setOnClickListener {

            val fName = firstName.text.toString().trim()
            val userEmail = email.text.toString().trim()
            val phone = phoneNumber.text.toString().trim()
            val userGender = gender.text.toString().trim()
            val userDob = dob.text.toString().trim()
            val userPassword = password.text.toString().trim()
            val userConfirmPassword = confirmPassword.text.toString().trim()

            // Input validations
            if (TextUtils.isEmpty(fName) || TextUtils.isEmpty(userEmail) ||
                TextUtils.isEmpty(phone) || TextUtils.isEmpty(userGender) ||
                TextUtils.isEmpty(userDob) || TextUtils.isEmpty(userPassword) ||
                TextUtils.isEmpty(userConfirmPassword)
            ) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (userPassword != userConfirmPassword) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // ✅ You can add backend API registration here later

            Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show()

            // 👉 Navigate to Sign-In Page
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
