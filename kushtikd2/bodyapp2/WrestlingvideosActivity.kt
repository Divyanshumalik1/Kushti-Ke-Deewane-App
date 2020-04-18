package com.kushtikd2.bodyapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_wrestlingvideos.*

class WrestlingvideosActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrestlingvideos)

        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        famwrestvidbtn.setOnClickListener { startActivity(Intent(this,TopWrestersWorkoutActivity::class.java)) }

        dangalvideosbtn.setOnClickListener { startActivity(Intent(this,DangalVideosActivity::class.java)) }

        akhadatrainbtn.setOnClickListener { startActivity(Intent(this,DesiAkhadaTraining::class.java)) }

        wrestlerfunnybtn.setOnClickListener { startActivity(Intent(this,WrestlersFunnyActivity::class.java)) }

        wrestdocumentariesbtn.setOnClickListener { startActivity(Intent(this,IndianWrestlingActivity::class.java)) }

    }
}
