package com.example.bankaprojesi2

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.example.bankaprojesi2.databinding.FragmentAnaSayfaBinding
import com.example.bankaprojesi2.databinding.FragmentParaTransferSayfaBinding
import android.view.View as View1

class ParaTransferSayfaFragment : Fragment() {
    private lateinit var binding: FragmentParaTransferSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View1 {
        binding = FragmentParaTransferSayfaBinding.inflate(inflater,container,false)

        binding.buttonParaGonder.setOnClickListener {
            val gonderilicekParax: String = binding.editTextGonderilicekTutar.text.toString()
            val gonderilicekKisiIban : String = binding.editTextGonderilenKisiIban.text.toString()
            if (gonderilicekParax.isNotBlank()) {
                try {
                    if (gonderilicekKisiIban.isEmpty()){
                        Toast.makeText(requireContext(), "Eksik Iban Bilgisi !", Toast.LENGTH_SHORT).show()
                    }
                    val gonderilicekPara = gonderilicekParax.toIntOrNull()
                    if (gonderilicekPara == null) {
                        Toast.makeText(requireContext(), "Lütfen gönderilecek miktarı giriniz!", Toast.LENGTH_SHORT).show()
                    }
                    else if (gonderilicekPara>Veri.MySingleton.bakiye){
                        val ad = androidx.appcompat.app.AlertDialog.Builder(requireContext())

                        ad.setTitle("HATA !")
                        ad.setMessage("Yetersiz Bakiye")

                        ad.setPositiveButton("Tekrar dene"){dialog , i ->
                            binding.editTextGonderilicekTutar.text.clear()
                        }
                        ad.setNegativeButton("İptal"){dialog , i->
                            dialog.dismiss()
                        }
                        ad.create().show()
                    }
                    else {
                        val bakiye = Veri.MySingleton.bakiye.toDouble()
                        // Gönderilecek para miktarı ve diğer işlemler
                    }
                } catch (e: Exception) {
                    println("HATA")
                    e.printStackTrace()
                }
            } else {
                Toast.makeText(requireContext(), "Lütfen gönderilecek miktarı giriniz!", Toast.LENGTH_SHORT).show()
            }
            val yeniBakiye = Veri.MySingleton.bakiye - gonderilicekParax.toDouble()
            println(yeniBakiye)
            Veri.MySingleton.bakiye = yeniBakiye
        }

        return binding.root
    }
}