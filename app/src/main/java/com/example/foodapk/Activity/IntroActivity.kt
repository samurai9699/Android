package com.example.foodapk.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.foodapk.LoginActivity
import com.example.foodapk.R
import com.example.foodapk.MainActivity
import com.example.foodapk.SignUpActivity

class IntroActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val s =supportActionBar?.hide()

        android.os.Handler().postDelayed({
            val Intent = Intent(this@IntroActivity, SignUpActivity::class.java)
            startActivity(Intent)
            finish()
        },1000)

//        val buttonClick = findViewById<Button>(R.id.startbtn)
//        buttonClick.setOnClickListener {
//            val intent = Intent(this, SignUpActivity::class.java)
//            startActivity(intent)
//        }
    }
}
