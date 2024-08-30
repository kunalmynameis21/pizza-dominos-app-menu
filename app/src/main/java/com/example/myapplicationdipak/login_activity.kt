package com.example.myapplicationdipak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        var button3 = findViewById<Button>(R.id.otp)
        button3.setOnClickListener {
            val intent1 =  Intent(this,food_manu::class.java)
            startActivity(intent1)
        }
    }
}