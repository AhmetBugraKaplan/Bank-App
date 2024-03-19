package com.example.bankaprojesi2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.bankaprojesi2.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    private lateinit var dovizArrayList:ArrayList<Dovizler>
    private lateinit var kartlarArrayList:ArrayList<Kartlar>
    private lateinit var adapter2 : kartlarAdapter
    private lateinit var adapter: DovizlerAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater,container,false)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager=LinearLayoutManager(context)

        binding.rvKartlar.setHasFixedSize(true)
        binding.rvKartlar.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)


        binding.textView2.text = Veri.MySingleton.bakiye.toString()


        binding.buttonAksiyon1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.cuzdanimSayfasiGecis)
        }

        binding.buttonAksiyon2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.portfoyFragmentGecis)
        }

        //GERİ DÖNÜŞ YAPILMIYOR
        binding.buttonAksiyon3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.paraTransferSayfasinaGecis)
        }


        val d1 =Dovizler("Dolar",32.24,32.50,"dolar")
        val d2 =Dovizler("Euro",35.44,35.78,"euro")
        val d3 =Dovizler("Altın",199.42,200.0,"gold")
        val d4 =Dovizler("Bitcon",1575.3,1577.9,"bitcoin2")
        val d6 =Dovizler("Sterlin",42.40,42.70,"sterlin")

        val k1 = Kartlar("7816 8585 4687 9516","Yemek Kartı","visa",Veri.MySingleton.bakiye)
        val k2 = Kartlar("0000 0000 0000 0000","Benim Kredi Kartım","master",999.0)

        dovizArrayList = ArrayList<Dovizler>()
        dovizArrayList.add(d1)
        dovizArrayList.add(d2)
        dovizArrayList.add(d3)
        dovizArrayList.add(d4)
        dovizArrayList.add(d6)


        kartlarArrayList=ArrayList<Kartlar>()
        kartlarArrayList.add(k1)
        kartlarArrayList.add(k2)


        adapter=DovizlerAdapter(requireContext(),dovizArrayList)
        binding.rv.adapter=adapter

        adapter2= kartlarAdapter(requireContext(),kartlarArrayList)
        binding.rvKartlar.adapter=adapter2


        return binding.root
    }
}
