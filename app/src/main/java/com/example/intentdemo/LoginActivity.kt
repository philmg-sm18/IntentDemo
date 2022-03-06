package com.example.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val name = intent.getStringExtra("name")

        val tvResult:TextView = findViewById(R.id.tvResult)
        tvResult.text = name
    }
}