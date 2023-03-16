package com.example.mediaalarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mediaalarm.databinding.ActivityCreateEditAlarmaBinding

class CreateEditAlarma : AppCompatActivity() {
    private lateinit var binding: ActivityCreateEditAlarmaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateEditAlarmaBinding.inflate(layoutInflater)
        val view = binding.root.also {
            setContentView(it)
        }
        val buttoncancel: Button = findViewById(R.id.btncancel)
        buttoncancel.setOnClickListener {
            val intent = Intent(this@CreateEditAlarma, TusAlarmas::class.java)
            startActivity(intent)
        }
        val buttonsave: Button = findViewById(R.id.btnsave)
        buttonsave.setOnClickListener {
            val intent = Intent(this@CreateEditAlarma, TusAlarmas::class.java)
            startActivity(intent)
        }
        val buttonmic: Button = findViewById(R.id.mic_button)
        buttonmic.setOnClickListener {
            val intent = Intent(this@CreateEditAlarma, NotaVoz::class.java)
            startActivity(intent)
        }
        val buttonimage: Button = findViewById(R.id.image_button)
        buttonimage.setOnClickListener {
            val intent = Intent(this@CreateEditAlarma, Gallery::class.java)
            startActivity(intent)
        }
    }

}