package com.example.myapplicationdipak

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myapplicationdipak.databinding.ActivityFoodManuBinding

class food_manu : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityFoodManuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFoodManuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var button1 = findViewById<TextView>(R.id.dropdown_menu)
        button1.setOnClickListener {
            val intent1 = Intent(this, last_page::class.java)
            startActivity(intent1)
        }

    }
}