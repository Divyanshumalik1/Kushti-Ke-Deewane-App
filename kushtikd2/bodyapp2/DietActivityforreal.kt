package com.kushtikd2.bodyapp2

import android.os.Build
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_diet_activityforreal.*

class DietActivityforreal : AppCompatActivity() {

    lateinit var mAdView : AdView
    //    companion object {
//        val YOUTUBE_API_KEY: String = "AIzaSyBDlD6j0nMvwYEmCA-bkPeXYZ_ssMNLKes"
//        val VIDEO_ID1: String = "rQoScOdvyFo"
//        val VIDEO_ID2: String = "9dLP_FcXl8I"
//        val VIDEO_ID3: String = "KJTITPOIxfo"
//        val VIDEO_ID4: String = "79iDnuqRW50"
//        val VIDEO_ID5: String = "axdfPEu7Vwg"
//        val VIDEO_ID6: String = "pqtZ6SFLuAc"
//        val VIDEO_ID7: String = "bahnbr3yxdE"
//        val VIDEO_ID8: String = "6oS4b_50oTU"
//        val VIDEO_ID9: String = "2yXL1seespA"
//        val VIDEO_ID10: String = "reHm6edZUEk"
//        val VIDEO_ID11: String = "5l9-_6jw5jc"
//        val VIDEO_ID12: String = "p5ti8LCbWsw"
//        val VIDEO_ID13: String = "n0awEswlBhc"
//        val VIDEO_ID14: String = "1157I0zbl8o"
//        val VIDEO_ID15: String = "dE8BkbrIxzM"
//        val VIDEO_ID16: String = "_uovL92Dnr8"
//
//    }
//
//
//    lateinit var youtubeplayerinit1 : YouTubePlayer.OnInitializedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_activityforreal)



        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)



//        recreatediet1.setOnClickListener { recreate() }
//        recreatediet2.setOnClickListener { recreate() }
//        recreatediet3.setOnClickListener { recreate() }
//        recreatediet4.setOnClickListener { recreate() }
//        recreatediet5.setOnClickListener { recreate() }
//        recreatediet6.setOnClickListener { recreate() }
//        recreatediet7.setOnClickListener { recreate() }
//        recreatediet8.setOnClickListener { recreate() }
//        recreatediet9.setOnClickListener { recreate() }
//        recreatediet10.setOnClickListener { recreate() }
//        recreatediet11.setOnClickListener { recreate() }
//        recreatediet12.setOnClickListener { recreate() }
//        recreatediet13.setOnClickListener { recreate() }
//        recreatediet14.setOnClickListener { recreate() }
//        recreatediet15.setOnClickListener { recreate() }
//        recreatediet16.setOnClickListener { recreate() }
//
//
//        btndiet1.setOnClickListener { initdiet1() }
//        btndiet2.setOnClickListener { initdiet2() }
//        btndiet3.setOnClickListener { initdiet3() }
//        btndiet4.setOnClickListener { initdiet4() }
//        btndiet5.setOnClickListener { initdiet5() }
//        btndiet6.setOnClickListener { initdiet6() }
//        btndiet7.setOnClickListener { initdiet7() }
//        btndiet8.setOnClickListener { initdiet8() }
//        btndiet9.setOnClickListener { initdiet9() }
//        btndiet10.setOnClickListener { initdiet10() }
//        btndiet11.setOnClickListener { initdiet11() }
//        btndiet12.setOnClickListener { initdiet12() }
//        btndiet13.setOnClickListener { initdiet13() }
//        btndiet14.setOnClickListener { initdiet14() }
//        btndiet15.setOnClickListener { initdiet15() }
//        btndiet16.setOnClickListener { initdiet16() }

        webviewdiet.settings.javaScriptEnabled = true
        webviewdiet.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewdiet.settings.allowFileAccess = true
        webviewdiet.settings.allowFileAccessFromFileURLs = true
        webviewdiet.settings.setAppCacheEnabled(true)
        webviewdiet.settings.allowContentAccess = true
        webviewdiet.webViewClient = MyWebviewdietclient()


        webviewdiet.loadUrl("https://www.youtube.com/playlist?list=PL4WzYyAVrxy-7GHm4f_w9NniVUmj87sYd")


        backbtndiet.setOnClickListener {

            if (webviewdiet.canGoBack())
                webviewdiet.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtndiet.setOnClickListener {

            if (webviewdiet.canGoForward())
                webviewdiet.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }

    }


    class MyWebviewdietclient : WebViewClient() {

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
//    private fun initdiet1() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet2() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet3() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet4() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet5() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet6() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet7() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet8() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet9() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet10() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet11() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet12() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet13() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet14() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet15() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//    private fun initdiet16() {
//        youtubeplayerinit1 = object : YouTubePlayer.OnInitializedListener {
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
//        youtubeplayerdiet.initialize(YOUTUBE_API_KEY, youtubeplayerinit1)
//
//    }
//
//
//
//}
//
