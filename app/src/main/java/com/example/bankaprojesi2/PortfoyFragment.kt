package com.example.bankaprojesi2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bankaprojesi2.databinding.FragmentAnaSayfaBinding
import com.example.bankaprojesi2.databinding.FragmentPortfoyBinding

class PortfoyFragment : Fragment() {
    private lateinit var binding: FragmentPortfoyBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPortfoyBinding.inflate(inflater,container,false)

















        return binding.root
    }

}