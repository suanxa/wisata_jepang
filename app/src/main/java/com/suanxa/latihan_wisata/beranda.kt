package com.suanxa.latihan_wisata
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class beranda : AppCompatActivity() {
    private lateinit var wisataAdapter: adapter_gambar
    private lateinit var wisataList: List<model_gambar>


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_beranda)

        wisataList = listOf(
            model_gambar("Shirakawa-Go","Gifu, tengah Jepang", R.drawable.jepang5,"Tanggal : 22 september 2024", "Shirakawa-Go yang terletak di bagian tengah Jepang terkenal akan rumah-rumah tradisionalnya yang beratap curam dari jerami dan dikelilingi oleh alam yang subur..\n" +
                    "\n" +
                    "Pemandangan menakjubkan dan suasana damai yang menyertainya membuat Situs Warisan Dunia UNESCO ini memang sangat layak untuk dikunjungi!."),

            model_gambar("Ghibli Museum","Tokyo", R.drawable.jepang4,"Tanggal : 22 september 2024", "Ghibli Museum adalah bentuk dedikasi para animator Studio Ghibli dan penghargaan untuk para penggemarnya yang tersebar di seluruh dunia.\n" +
                    "\n" +
                    "Tenggelamkan diri dalam keajaiban ala Studio Ghibli dan temui Totoro ataupun Princess Mononoke di dunia nyata.\n" +
                    "\n" +
                    "Selain menyuguhkan berbagai instalasi dari animasi-animasi Studio Ghibli, Ghibli Museum juga punya area pemutaran film yang menayangkan animasi pendek berdurasi sekitar 20 menit. Tonton karya-karya studio yang juga mendapat 15 penghargaan di Jepang dan 5 nominasi Piala Oscar dengan suasana berbeda."),

            model_gambar("Mount Fuji","Shizuoka, Yamanashi", R.drawable.jepang3,"Tanggal : 22 september 2024", "Berdiri di ketinggian 3.765 meter, Mount Fuji menjadi gunung tertinggi Jepang! Gunung berapi ini merupakan salah satu situs ikonik dan menjadi favorit banyak orang. \n" +
                    "\n" +
                    "Kamu dapat mengagumi keindahan Mount Fuji dari berbagai danau yang mengelilingi, mulai dari Lake Kawaguchi, Lake Yamanaka, Lake Sai, Lake Shoji, Lake Motosu, dan Lake Ashi."),

            model_gambar("Tokyo Disney Resort","Tokyo", R.drawable.jepang2,"Tanggal : 22 september 2024", "Ada banyak wahana seru yang bisa kamu eskplor di Tokyo Disneyland. Namun, bersiaplah untuk mengantre untuk wahana-wahana populer. Tips dari tour guide, utamakan untuk segera menaiki wahana populer begitu kamu tiba di Tokyo Disneyland.\n" +
                    "\n" +
                    "Selain wahana, kamu dapat mengikuti parade siang hari yang menjadi favorit banyak turis, Dreaming Up! Di parade ini kamu dapat melihat bermacam-macam karakter Disney berjalan mengelilingi taman.")
        )

        wisataAdapter = adapter_gambar(wisataList){ wisata ->
            val intent = Intent(this, detail_gambar::class.java)
            intent.putExtra("WISATA", wisata)
            startActivity(intent)
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = wisataAdapter

    }
}