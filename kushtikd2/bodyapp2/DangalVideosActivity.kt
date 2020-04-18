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
import kotlinx.android.synthetic.main.activity_dangal_videos.*

class DangalVideosActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dangal_videos)

        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


        webviewdangalvid.settings.javaScriptEnabled = true
        webviewdangalvid.settings.setAppCacheEnabled(true)
        webviewdangalvid.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewdangalvid.settings.allowContentAccess = true
        webviewdangalvid.settings.allowFileAccess = true
        webviewdangalvid.settings.allowFileAccessFromFileURLs = true

        webviewdangalvid.webViewClient = MyWebviewdangalvidclient()


        webviewdangalvid.loadUrl(
            "https://www.youtube.com/playlist?list=PL4WzYyAVrxy_zo05cP-vNPBcymklhKxAv"
        )

        backbtndangalvid.setOnClickListener {

            if (webviewdangalvid.canGoBack())
                webviewdangalvid.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtndangalvid.setOnClickListener {

            if (webviewdangalvid.canGoForward())
                webviewdangalvid.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewdangalvidclient : WebViewClient(){

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
