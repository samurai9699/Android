package com.example.foodapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.foodapk.Activity.IntroActivity

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val clickme=findViewById<Button>(R.id.btnback)

        clickme.setOnClickListener{
            Toast.makeText( this, "Exit", Toast.LENGTH_SHORT).show()
        }
     val btnback = findViewById<Button>(R.id.btnback)
        btnback.setOnClickListener{
            var Intent = Intent( this,IntroActivity::class.java)
            startActivity(Intent)
            finish()
        }
    }
}