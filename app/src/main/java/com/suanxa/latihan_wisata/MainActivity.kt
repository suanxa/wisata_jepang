package com.suanxa.latihan_wisata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tombol1: Button = findViewById(R.id.pil1)
        tombol1.setOnClickListener {
            val intent = Intent(this, beranda::class.java)
            startActivity(intent)
        }
    }
}