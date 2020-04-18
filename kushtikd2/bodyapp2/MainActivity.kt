package com.kushtikd2.bodyapp2

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


//        setActionBar(toolbar1)
//        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)


        kkdupdates.setOnClickListener {
            startActivity(Intent(this,NewsUpdatesActivity::class.java))
        }

        livedangalbutton.setOnClickListener {

            startActivity(Intent(this,LiveDangalActivity::class.java))
        }

        wrestvids.setOnClickListener {

            startActivity(Intent(this,WrestlingvideosActivity::class.java))
        }

        techniques.setOnClickListener {

            startActivity(Intent(this,Wrestlingtechniqueactivity::class.java))

        }

        privacypolicy.setOnClickListener {


            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://kushtikedeewane.herokuapp.com/privacy_policy.html")
            startActivity(intent)
        }

        Motivation1.setOnClickListener {

            startActivity(Intent(this,MotivationActivity::class.java))


//            val i = Intent()
//            i.action = Intent.ACTION_VIEW
//            i.data = Uri.parse("https://youtu.be/3uI_z1tPq2w")
//            startActivity(i)
        }

        Shopping1.setOnClickListener {

            startActivity(Intent(this,ShoppingActivity::class.java))
        }


        websitewrest.setOnClickListener {

            startActivity(Intent(this,Wrestlingwebsites::class.java))

//            val intent = Intent()
//            intent.action = Intent.ACTION_VIEW
//            intent.data = Uri.parse("http://wrestlingfederationofindia.com/")
//            startActivity(intent)
        }


        Workout.setOnClickListener {

            startActivity(Intent(this,WorkoutActivity::class.java))
        }


            Diet1.setOnClickListener {

            startActivity(Intent(this,DietActivityforreal::class.java))
        }

        supportusbutton.setOnClickListener {
            val is1 = Intent()
            is1.action = Intent.ACTION_VIEW
            is1.data = Uri.parse("https://p-y.tm/Zslv-kw")
            startActivity(is1)

        }


wrestlingtv.setOnClickListener {
    startActivity(Intent(this,wrestlingtvactivity::class.java))

}

        joinkkdclub.setOnClickListener {
            val is2 = Intent()
            is2.action = Intent.ACTION_VIEW
            is2.data = Uri.parse("https://wa.me/918287320544")
            startActivity(is2)
        }

        contactus.setOnClickListener {
            val is3 = Intent()
            is3.action = Intent.ACTION_VIEW
            is3.data = Uri.parse("https://wa.me/919582018195")
            startActivity(is3)
        }

    }


//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        val m = menuInflater
//        menuInflater.inflate(R.menu.menu_main, menu)
//
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return super.onOptionsItemSelected(item)
    }

//        val video = VideoView(this)
//        video.setVideoPath("https://www.youtube.com/watch?v=RqiQmj4hlzM")
//
//        //play pause stop
//        val mediaController = MediaController(this)
//        mediaController.setAnchorView(video)
//        video.setMediaController(mediaController)
//
//        video.start()


