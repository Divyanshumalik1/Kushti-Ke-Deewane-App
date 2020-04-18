package com.kushtikd2.bodyapp2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_shopping.*

class ShoppingActivity : YouTubeBaseActivity() {


    companion object {
        val YOUTUBE_API_KEY: String = "AIzaSyBDlD6j0nMvwYEmCA-bkPeXYZ_ssMNLKes"
        val VIDEO_ID1: String = "bahnbr3yxdE"
        val VIDEO_ID2: String = "axdfPEu7Vwg"
        val VIDEO_ID3: String = "SIeibYSKu04"
    }


    lateinit var mAdView : AdView

    lateinit var youtubeplayerinitshop : YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)



        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


        btnmudgarplay.setOnClickListener { initshop3() }
        btnkeedaplay.setOnClickListener { initshop1() }
        btnkundiplay.setOnClickListener {  initshop2()}
        recreateshop1.setOnClickListener { recreate() }
        recreateshop2.setOnClickListener { recreate() }
        recreateshop3.setOnClickListener { recreate() }
        kustistore.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://www.amazon.in/shop/kushtikedeewane")
            startActivity(intent)
        }
        buykeedabtn.setOnClickListener {
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("https://forms.gle/GHJoWxgxyPaTXuo67")
            startActivity(i)

        }
        buykundibtn.setOnClickListener {
            val i2 = Intent()
            i2.action = Intent.ACTION_VIEW
            i2.data = Uri.parse("https://forms.gle/svuTPjQNvXNHAqxF6")
            startActivity(i2)
        }
        buymudgarbtn.setOnClickListener {
            val i3 = Intent()
            i3.action = Intent.ACTION_VIEW
            i3.data = Uri.parse("https://forms.gle/UuXJ9fHNYpZ3RFJS8")
            startActivity(i3)

        }


    }

    private fun initshop1() {
        youtubeplayerinitshop = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
                p1?.loadVideo(VIDEO_ID1)
            }

            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }

        shopyoutubeplayer.initialize(YOUTUBE_API_KEY,youtubeplayerinitshop)
    }

    private fun initshop2() {
        youtubeplayerinitshop = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
                p1?.loadVideo(VIDEO_ID2)
            }

            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }

        shopyoutubeplayer.initialize(YOUTUBE_API_KEY,youtubeplayerinitshop)
    }

    private fun initshop3() {
        youtubeplayerinitshop = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
                p1?.loadVideo(VIDEO_ID3)
            }

            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }

        shopyoutubeplayer.initialize(YOUTUBE_API_KEY,youtubeplayerinitshop)
    }




}



