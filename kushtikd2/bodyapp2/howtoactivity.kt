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
import kotlinx.android.synthetic.main.activity_howtoactivity.*

class howtoactivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_howtoactivity)

        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        webviewhowto.settings.javaScriptEnabled = true
        webviewhowto.settings.setAppCacheEnabled(true)
        webviewhowto.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewhowto.settings.allowContentAccess = true
        webviewhowto.settings.allowFileAccess = true
        webviewhowto.settings.allowFileAccessFromFileURLs = true
        webviewhowto.webViewClient = MyWebviewhowtoclient()
        webviewhowto.loadUrl(
            "https://www.youtube.com/playlist?list=PLA5TpPZ_1xHXNQ4fZZn2O72VlYY3LHNrX"
        )

        backbtnhowto.setOnClickListener {

            if (webviewhowto.canGoBack())
                webviewhowto.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtnhowto.setOnClickListener {

            if (webviewhowto.canGoForward())
                webviewhowto.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewhowtoclient : WebViewClient(){

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
