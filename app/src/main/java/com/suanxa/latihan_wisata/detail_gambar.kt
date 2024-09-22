package com.suanxa.latihan_wisata
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class detail_gambar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_gambar)

        val wisata = intent.getParcelableExtra<model_gambar>( "WISATA")

        if(wisata != null){
            val namaTextView: TextView = findViewById(R.id.tv_nama)
            val lokasiTextView: TextView = findViewById(R.id.tv_lokasi)
            val tanggalTextView: TextView = findViewById(R.id.tv_tanggal)
            val detailTextView: TextView = findViewById(R.id.tv_detail)
            val gambarImageView: ImageView = findViewById(R.id.iv_gambar)

            namaTextView.text = wisata.nama
            lokasiTextView.text = wisata.lokasi
            tanggalTextView.text = wisata.tanggal
            detailTextView.text = wisata.detail
            gambarImageView.setImageResource(wisata.gambar)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}