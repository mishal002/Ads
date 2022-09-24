package com.example.ads

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ads.databinding.ActivityMainBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MobileAds.initialize(this) {}


        bannerAd()
    }

    fun bannerAd() {
        var adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)
    }
}