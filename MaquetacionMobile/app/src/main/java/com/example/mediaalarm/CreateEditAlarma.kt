package com.example.mediaalarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mediaalarm.databinding.ActivityCreateEditAlarmaBinding

class CreateEditAlarma : AppCompatActivity() {
    private lateinit var binding: ActivityCreateEditAlarmaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateEditAlarmaBinding.inflate(layoutInflater)
        val view = binding.root.also {
            setContentView(it)
        }
    }

}