package com.example.mediaalarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val button: Button = findViewById(R.id.btnlogin)
        button.setOnClickListener {
            val intent = Intent(this@Register, CreateEditAlarma::class.java)
            startActivity(intent)
        }
    }
}