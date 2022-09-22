package com.example.foodapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)



//         val bottomnav = findViewById<BottomNavigationView>(R.id.btm_nav)
//          val navController =  Navigation.findNavController(this,R.id.hostt_fragment)
//
//         NavigationUI.setupWithNavController(bottomnav,navController)
    }

}