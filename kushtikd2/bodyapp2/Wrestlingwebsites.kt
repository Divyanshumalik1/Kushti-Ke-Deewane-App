package com.kushtikd2.bodyapp2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_wrestlingwebsites.*

class Wrestlingwebsites : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrestlingwebsites)



        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        ABKMbtn.setOnClickListener { startActivity(Intent(this,AkhilBhartiyaKushtiMahasanghActivity::class.java)) }

//        KUSHTIJGTbtn.setOnClickListener {
//            val i8 = Intent()
//            i8.action = Intent.ACTION_VIEW
//            i8.data = Uri.parse("https://www.facebook.com/kustijagat/")
//            startActivity(i8)
//        }

        wrestfed.setOnClickListener {
            startActivity(Intent(this,wrestlingfederationofindiaactivity::class.java))
        }

        unitedwrest1.setOnClickListener {
            startActivity(Intent(this,unitedworldwrestlingactivity::class.java))
        }

        unitedwrest2.setOnClickListener {
            val i3 = Intent()
            i3.action = Intent.ACTION_VIEW
            i3.data = Uri.parse("https://www.youtube.com/user/WrestlingTV")
            startActivity(i3)
        }

        kkdinstabtn.setOnClickListener {
            val i4 = Intent()
            i4.action = Intent.ACTION_VIEW
            i4.data = Uri.parse("https://instagram.com/kushtikedeewane?igshid=plzxb9spuu5k")
            startActivity(i4)
        }

        wrestlingtvwebsite.setOnClickListener {
            startActivity(Intent(this,wrestlingtvwebsiteactivity::class.java))
        }

        kkdutubebtn.setOnClickListener {
            val i5 = Intent()
            i5.action = Intent.ACTION_VIEW
            i5.data = Uri.parse("https://instagram.com/kushtikd?igshid=s1ffks7kpgr2")
            startActivity(i5)
        }

//        kushtiwrestling.setOnClickListener {  val i6 = Intent()
//            i6.action = Intent.ACTION_VIEW
//            i6.data = Uri.parse("https://www.youtube.com/user/kushtiwrestling")
//            startActivity(i6)
//        }
//
//        kushtiwrestlingtv.setOnClickListener {
//            val i7 = Intent()
//            i7.action = Intent.ACTION_VIEW
//            i7.data = Uri.parse("https://www.youtube.com/user/ansuia1974")
//            startActivity(i7)
//        }


    }
}
