package com.example.myapplicationdipak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class last_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_last_page)
        var button1 = findViewById<TextView>(R.id.dropdown_menuits)
        button1.setOnClickListener {
            val intent1 = Intent(this, food_menu::class.java)
            startActivity(intent1)
        }
    }
}