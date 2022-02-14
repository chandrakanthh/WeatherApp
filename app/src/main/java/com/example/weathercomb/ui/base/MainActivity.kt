package com.example.weathercomb.ui.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weathercomb.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}