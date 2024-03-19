package com.example.bankaprojesi2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DovizlerAdapter(private val mContext: Context,private val  DovizListesi:List<Dovizler>)
    :RecyclerView.Adapter<DovizlerAdapter.CardViewHolder>() {

        inner class CardViewHolder(view: View):RecyclerView.ViewHolder(view){
            var imageViewDovizResim:ImageView
            var textViewDovizAdi:TextView
            var textViewDovizSatFiyat:TextView
            var textViewDovizAlFiyat:TextView

            //Constructor
            init {
                imageViewDovizResim=view.findViewById(R.id.imageViewDovizResim)
                textViewDovizAdi=view.findViewById(R.id.textViewDovizAdi)
                textViewDovizAlFiyat=view.findViewById(R.id.textViewDovizAlFiyat)
                textViewDovizSatFiyat=view.findViewById(R.id.textViewDovizSatFiyat)
            }
        }

    //Card tasarımını kod ile bağlıyoruz
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_doviz_tasarim,parent,false)
        return CardViewHolder(tasarim)
    }

    //Kaç tane cardview olucağının sayısını listedeki eleman sayısı ile veriyoruz
    override fun getItemCount(): Int {
        return DovizListesi.size
    }


    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val doviz = DovizListesi[position]

        holder.imageViewDovizResim.setImageResource(mContext.resources.getIdentifier(doviz.dovizResimAdres,"drawable",mContext.packageName))
        holder.textViewDovizAdi.text=doviz.dovizAd
        holder.textViewDovizAlFiyat.text=doviz.dovizAlisFiyat.toString()
        holder.textViewDovizSatFiyat.text=doviz.dovizSatFiyat.toString()
    }


}