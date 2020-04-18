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
import kotlinx.android.synthetic.main.activity_wrestlers_funny.*

class WrestlersFunnyActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrestlers_funny)



        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        webviewwrestlersfunny.settings.javaScriptEnabled = true
        webviewwrestlersfunny.settings.setAppCacheEnabled(true)
        webviewwrestlersfunny.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewwrestlersfunny.settings.allowContentAccess = true
        webviewwrestlersfunny.settings.allowFileAccess = true
        webviewwrestlersfunny.settings.allowFileAccessFromFileURLs = true
        webviewwrestlersfunny.webViewClient = MyWebviewwrestlersfunnyclient()
        webviewwrestlersfunny.loadUrl(
            "https://www.youtube.com/playlist?list=PL4WzYyAVrxy-Tj3YinfuDzcvQHTxih6ts"
        )

        backbtnwrestlersfunny.setOnClickListener {

            if (webviewwrestlersfunny.canGoBack())
                webviewwrestlersfunny.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtnwrestlersfunny.setOnClickListener {

            if (webviewwrestlersfunny.canGoForward())
                webviewwrestlersfunny.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewwrestlersfunnyclient : WebViewClient(){

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
