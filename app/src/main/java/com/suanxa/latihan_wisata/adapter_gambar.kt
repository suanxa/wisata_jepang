package com.suanxa.latihan_wisata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter_gambar (
    private val wisataList : List<model_gambar>,
    private val onItemClick : (model_gambar) -> Unit
) : RecyclerView.Adapter<adapter_gambar.WisataViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_gambar,parent,false)
        return WisataViewHolder(view)
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val wisata = wisataList[position]
        holder.bind(wisata, onItemClick)
    }

    override fun getItemCount(): Int {
        return wisataList.size
    }

    inner class WisataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val namaTextView : TextView = itemView.findViewById(R.id.tv_nama)
        val lokasiTextView : TextView = itemView.findViewById(R.id.tv_lokasi)
        val gambarImageView : ImageView = itemView.findViewById(R.id.iv_gambar)

        fun bind(wisata: model_gambar, onItemClick: (model_gambar) -> Unit){
            namaTextView.text = wisata.nama
            lokasiTextView.text = wisata.lokasi
            gambarImageView.setImageResource(wisata.gambar)

            itemView.setOnClickListener{
                onItemClick(wisata)
            }
        }
    }
}