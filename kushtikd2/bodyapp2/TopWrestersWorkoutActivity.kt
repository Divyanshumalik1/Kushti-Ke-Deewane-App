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
import kotlinx.android.synthetic.main.activity_top_wresters_workout.*

class TopWrestersWorkoutActivity : AppCompatActivity() {

    //    companion object{
//        val YOUTUBE_API_KEY: String = "AIzaSyBDlD6j0nMvwYEmCA-bkPeXYZ_ssMNLKes"
//        val VIDEO_ID1: String = "K2BhjvZrJDg"
//        val VIDEO_ID2: String = "WxkIpEKlcrQ"
//        val VIDEO_ID3: String = "q6maaTcUJ6s"
//        val VIDEO_ID4: String = "AfazWoTLNYo"
//        val VIDEO_ID5: String = "1_ffoZ7ZJ2g"
//        val VIDEO_ID6: String = "Li7ojwi8aeg"
//        val VIDEO_ID7: String = "V6i8pfZ_Zys"
//        val VIDEO_ID8: String = "Obz9PsP5S0Y"
//        val VIDEO_ID9: String = "yzSog7kzC_E"
//        val VIDEO_ID10: String = "8nvLvbl623I"
//        val VIDEO_ID11: String = "0OI37f2D5QE"
//        val VIDEO_ID12: String = "W6uSqAjSlMk"
//        val VIDEO_ID13: String = "0ej_bP00TKA"
//        val VIDEO_ID14: String = "6oyzh9rmCUU"
//    }
//    lateinit var youtubeplayerinittopwrest: YouTubePlayer.OnInitializedListener

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_wresters_workout)



        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

//        //ALL RECREATE BUTTONS
//        recreatetopwrest1.setOnClickListener { recreate() }
//        recreatetopwrest2.setOnClickListener { recreate() }
//        recreatetopwrest3.setOnClickListener { recreate() }
//        recreatetopwrest4.setOnClickListener { recreate() }
//        recreatetopwrest5.setOnClickListener { recreate() }
//        recreatetopwrest6.setOnClickListener { recreate() }
//        recreatetopwrest7.setOnClickListener { recreate() }
//        recreatetopwrest8.setOnClickListener { recreate() }
//        recreatetopwrest9.setOnClickListener { recreate() }
//        recreatetopwrest10.setOnClickListener { recreate() }
//        recreatetopwrest11.setOnClickListener { recreate() }
//        recreatetopwrest12.setOnClickListener { recreate() }
//        recreatetopwrest13.setOnClickListener { recreate() }
//        recreatetopwrest14.setOnClickListener { recreate() }
//
//
//        //ALL SETON CLICK LISTENERS
//        sushilworkbtn1.setOnClickListener { inittop1() }
//        sushilworkbtn2.setOnClickListener { inittop2() }
//        yogeshwork1.setOnClickListener { inittop3() }
//        yogeshwork2.setOnClickListener { inittop4() }
//        bajrangbtn1.setOnClickListener { inittop5() }
//        bajrangbtn2.setOnClickListener { inittop6() }
//        amitworkbtn.setOnClickListener { inittop7() }
//        pawanworkbtn.setOnClickListener { inittop8() }
//        baniaworkbtn1.setOnClickListener { inittop9() }
//        baniaworkbtn2.setOnClickListener { inittop10() }
//        sakshiworkbtn.setOnClickListener { inittop11() }
//        poojaworkbtn.setOnClickListener { inittop12() }
//        womenworkbtn.setOnClickListener { inittop13() }
//        goongaworkbtn.setOnClickListener { inittop14() }

        webview111.settings.setAppCacheEnabled(true)
        webview111.settings.allowFileAccessFromFileURLs = true
        webview111.settings.allowFileAccess = true
        webview111.settings.javaScriptCanOpenWindowsAutomatically  = true
        webview111.settings.javaScriptEnabled = true

        webview111.webViewClient = Mywebviewclient()


        webview111.loadUrl(
            //"https://youtu.be/_JmhIIhKjPM"
            " https://www.youtube.com/playlist?list=PL4WzYyAVrxy-GEjq4Iqmi0kAhiAceUx8l"

            //    "https://www.amazon.in/shop/kushtikedeewane"
//    "https://forms.gle/svuTPjQNvXNHAqxF6"
        )

        backbtn.setOnClickListener {

            if (webview111.canGoBack())
                webview111.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtn.setOnClickListener {

            if (webview111.canGoForward())
                webview111.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }


    }

    class Mywebviewclient : WebViewClient(){

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

}

//    private fun inittop1() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID1)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    //ALL FUNCTIONS BEING CALEED
//
//    private fun inittop2() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID2)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//
//    private fun inittop3() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID3)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//
//    private fun inittop4() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID4)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    private fun inittop5() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID5)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    private fun inittop6() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID6)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    private fun inittop7() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID7)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    private fun inittop8() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID8)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    private fun inittop9() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID9)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    private fun inittop10() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID10)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    private fun inittop11() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID11)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    private fun inittop12() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID12)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    private fun inittop13() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID13)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//
//    private fun inittop14() {
//        youtubeplayerinittopwrest = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
//                p1?.loadVideo(VIDEO_ID14)
//            }
//
//            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//        }
//
//        youtubeplayertopwrestlers.initialize(YOUTUBE_API_KEY,youtubeplayerinittopwrest)
//
//    }
//}
