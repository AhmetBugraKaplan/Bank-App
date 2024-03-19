package com.example.bankaprojesi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.bankaprojesi2.databinding.ActivityMainBinding

//Mainden geri gidince alttaki barın gitmemsi yani visiblytisini nasıl false yapabilirim login ekranında vs.
//Recycler view iç içe girmesi
//Kartların farklı renkde olması
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val navHostFragmentx = supportFragmentManager.findFragmentById(R.id.navHostFragmentx) as NavHostFragment

        NavigationUI.setupWithNavController(binding.bottomNav,navHostFragmentx.navController)
    }
}