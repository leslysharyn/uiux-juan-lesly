package com.example.mediaalarm.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mediaalarm.R
import com.example.mediaalarm.Register
import com.example.mediaalarm.TusAlarmas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.registerbtn)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, Register::class.java)
            startActivity(intent)
        }

        val buttonlogin: Button = findViewById(R.id.btnlogin)
        buttonlogin.setOnClickListener {
            val intent = Intent(this@MainActivity, TusAlarmas::class.java)
            startActivity(intent)
        }
    }
}