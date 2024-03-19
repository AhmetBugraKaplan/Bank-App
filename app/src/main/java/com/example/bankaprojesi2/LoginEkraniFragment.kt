package com.example.bankaprojesi2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bankaprojesi2.databinding.FragmentLoginEkraniBinding


class LoginEkraniFragment : Fragment() {
    private lateinit var binding : FragmentLoginEkraniBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLoginEkraniBinding.inflate(inflater,container,false)


        val sp = getSharedPreferences("KisiselBilgiler", android.content.Context.MODE_PRIVATE)



        return binding.root
    }

}
