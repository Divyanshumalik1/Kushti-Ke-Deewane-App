package com.kushtikd2.bodyapp2

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_wrestling.*

class WrestlingActivity : AppCompatActivity() {



//    companion object {
//        val YOUTUBE_API_KEY: String = "AIzaSyBDlD6j0nMvwYEmCA-bkPeXYZ_ssMNLKes"
//        val VIDEO_ID1: String = "KoaH6U57OCI"
//        val VIDEO_ID2: String = "oPpg_-Y5BqQ"
//        val VIDEO_ID3: String = "Ffn_jX5cGv4"
//        val VIDEO_ID4: String = "9GkVQmrH7Ck"
//        val VIDEO_ID5: String = "Bb5qn8zekf4"
//        val VIDEO_ID6: String = "Ya833rfHlUU"
//        val VIDEO_ID7: String = "gYVPTqMFVcg"
//        val VIDEO_ID8: String = "MT_xiF6n8_0"
//        val VIDEO_ID9: String = "3djaF20sMZ4"
//        val VIDEO_ID10: String = "CBMCgrbfBz4"
//        val VIDEO_ID11: String = "L6sZVuVb59M"
//        val VIDEO_ID12: String = "SIeibYSKu04"
//        val VIDEO_ID13: String = "F11t0fSEHEc"
//        val VIDEO_ID14: String = "VQmXzsvvq2I"
//        val VIDEO_ID15: String = "K2107sWdGGg"
//        val VIDEO_ID16: String = "6CVfoCBD7iU"
//        val VIDEO_ID17: String = "4mv3oMfj0U0"
//        val VIDEO_ID18: String = "MV3680AsPA0"
//        val VIDEO_ID19: String = "GAIcLeykVYI"
//        val VIDEO_ID20: String = "GnFlkkPbHjc"
//        val VIDEO_ID21: String = "ZmkOI6lrDl8"
//        val VIDEO_ID22: String = "5PLX01a868k"
//        val VIDEO_ID23: String = "kZzs2jpRsWg"
//
//
//
//
//
//    }
//
//
// lateinit var youtubeplayerinit : YouTubePlayer.OnInitializedListener

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrestling)


    MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
    mAdView = findViewById(R.id.adView)
    val adRequest = AdRequest.Builder().build()
    mAdView.loadAd(adRequest)

    webviewwrest.settings.javaScriptEnabled = true
    webviewwrest.settings.javaScriptCanOpenWindowsAutomatically = true
    webviewwrest.settings.allowFileAccess = true
    webviewwrest.settings.allowFileAccessFromFileURLs = true
    webviewwrest.settings.setAppCacheEnabled(true)
    webviewwrest.settings.allowContentAccess = true
    webviewwrest.webViewClient = MyWebviewwrestclient()


    webviewwrest.loadUrl("https://www.youtube.com/playlist?list=PL4WzYyAVrxy89uurt7HPebgKyn244YpqQ")


    backbtnwrest.setOnClickListener {

        if ( webviewwrest.canGoBack())
            webviewwrest.goBack()
        else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

    }



    forwardbtnwrest.setOnClickListener {

        if ( webviewwrest.canGoForward())
            webviewwrest.goForward()
        else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

    }

//        recreatebtn1.setOnClickListener { recreate() }
//        recreatebtn2.setOnClickListener { recreate() }
//        recreatebtn3.setOnClickListener { recreate() }
//        recreatebtn4.setOnClickListener { recreate() }
//        recreatebtn5.setOnClickListener { recreate() }
//        recreatebtn6.setOnClickListener { recreate() }
//        recreatebtn7.setOnClickListener { recreate() }
//        recreatebtn8.setOnClickListener { recreate() }
//        recreatebtn9.setOnClickListener { recreate() }
//        recreatebtn10.setOnClickListener { recreate() }
//        recreatebtn11.setOnClickListener { recreate() }
//        recreatebtn12.setOnClickListener { recreate() }
//        recreatebtn13.setOnClickListener { recreate() }
//        recreatebtn14.setOnClickListener { recreate() }
//        recreatebtn15.setOnClickListener { recreate() }
//        recreatebtn16.setOnClickListener { recreate() }
//        recreatebtn17.setOnClickListener { recreate() }
//        recreatebtn18.setOnClickListener { recreate() }
//        recreatebtn19.setOnClickListener { recreate() }
//        recreatebtn20.setOnClickListener { recreate() }
//        recreatebtn21.setOnClickListener { recreate() }
//        recreatebtn22.setOnClickListener { recreate() }
//        recreatebtn23.setOnClickListener { recreate() }
//        //recreatebuttonlisteners
//
//        btnplay1.setOnClickListener { initUI1() }
//        btnplay2.setOnClickListener { initUI2() }
//        btnplay3.setOnClickListener { initUI3() }
//        btnplay4.setOnClickListener { initUI4() }
//        btnplay5.setOnClickListener { initUI5() }
//        btnplay6.setOnClickListener { initUI6() }
//        btnplay7.setOnClickListener { initUI7() }
//        btnplay8.setOnClickListener { initUI8() }
//        btnplay9.setOnClickListener { initUI9() }
//        btnplay10.setOnClickListener { initUI10() }
//        btnplay11.setOnClickListener { initUI11() }
//        btnplay12.setOnClickListener { initUI12() }
//        btnplay13.setOnClickListener { initUI13() }
//        btnplay14.setOnClickListener { initUI14() }
//        btnplay15.setOnClickListener { initUI15() }
//        btnplay16.setOnClickListener { initUI16() }
//        btnplay17.setOnClickListener { initUI17() }
//        btnplay18.setOnClickListener { initUI18() }
//        btnplay19.setOnClickListener { initUI19() }
//        btnplay20.setOnClickListener { initUI20() }
//        btnplay21.setOnClickListener { initUI21() }
//        btnplay22.setOnClickListener { initUI22() }
//        btnplay23.setOnClickListener { initUI23() }
//        //all setonclicklisteners


    }


    class MyWebviewwrestclient : WebViewClient() {

        @RequiresApi(Build.VERSION_CODES.O)
        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            view?.loadUrl(request?.url.toString())
            return true
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            view?.loadUrl(url)
            return true
        }

    }



// all functions are made here
//    private fun initUI1() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID1)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI2() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID2)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI3() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID3)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI4() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID4)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI5() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID5)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI6() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID6)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI7() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID7)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI8() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID8)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI9() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID9)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI10() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID10)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI11() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID11)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI12() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID12)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI13() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID13)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI14() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID14)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI15() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID15)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI16() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID16)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI17() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID17)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI18() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID18)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI19() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID19)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI20() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID20)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI21() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID21)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI22() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID22)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }
//
//    private fun initUI23() {
//        youtubeplayerinit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youTubePlayer: YouTubePlayer?, p2: Boolean) {
//                youTubePlayer?.loadVideo(VIDEO_ID23)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayer.initialize(YOUTUBE_API_KEY, youtubeplayerinit)
//
//    }



}
