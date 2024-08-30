package com.example.myapplicationdipak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var button1= findViewById<Button>(R.id.login)
        button1.setOnClickListener {
            var intent1= Intent(this,login_activity::class.java)
            startActivities(arrayOf(intent1))

        }
    }
}