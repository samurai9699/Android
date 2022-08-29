package com.example.foodapk.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapk.R
import com.example.foodapk.home

class IntroActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val s =supportActionBar?.hide()

        android.os.Handler().postDelayed({
            val Intent = Intent(this@IntroActivity, home::class.java)
            startActivity(Intent)
            finish()
        },3000)

    }
}
