package com.example.bankaprojesi2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bankaprojesi2.databinding.FragmentCuzdanimSayfaBinding


class CuzdanimSayfaFragment : Fragment() {
    private lateinit var binding: FragmentCuzdanimSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCuzdanimSayfaBinding.inflate(inflater,container,false)

        binding.textViewCuzdanBakiye.text = Veri.MySingleton.bakiye.toString()







        return binding.root
    }

}