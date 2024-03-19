package com.example.bankaprojesi2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class kartlarAdapter(private val mContext: Context,private val Kartlar:List<Kartlar>)
    : RecyclerView.Adapter<kartlarAdapter.cardKartlarViewHolder>(){

    inner class cardKartlarViewHolder(view: View):RecyclerView.ViewHolder(view){
        var imageViewKartTuru: ImageView
        var textViewKartTuruText:TextView
        var textViewKartNo:TextView
        var textViewBakiye:TextView

        init {
            imageViewKartTuru = view.findViewById(R.id.imageViewKartTuru)
            textViewKartTuruText = view.findViewById(R.id.textViewKartTuruText)
            textViewKartNo= view.findViewById(R.id.textViewKartNo)
            textViewBakiye=view.findViewById(R.id.textViewBakiye)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardKartlarViewHolder {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.kartlar_card_tasarimi,parent,false)
        return cardKartlarViewHolder(tasarim)

    }

    override fun getItemCount(): Int {
      return Kartlar.size
    }

    override fun onBindViewHolder(holder: cardKartlarViewHolder, position: Int) {
        val kart = Kartlar[position]

        holder.imageViewKartTuru.setImageResource(mContext.resources.getIdentifier(kart.kartLogoResim,"drawable",mContext.packageName))
        holder.textViewKartNo.text = kart.kartNo.toString()
        holder.textViewKartTuruText.text = kart.kartIsim
        holder.textViewBakiye.text=Veri.MySingleton.bakiye.toString()
    }


}