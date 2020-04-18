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
import kotlinx.android.synthetic.main.activity_wrestlingfederationofindiaactivity.*

class wrestlingfederationofindiaactivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrestlingfederationofindiaactivity)

        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        webviewwrestfed.settings.javaScriptEnabled = true
        webviewwrestfed.settings.setAppCacheEnabled(true)
        webviewwrestfed.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewwrestfed.settings.allowContentAccess = true
        webviewwrestfed.settings.allowFileAccess = true
        webviewwrestfed.settings.allowFileAccessFromFileURLs = true
        webviewwrestfed.webViewClient = MyWebviewwrestfedclient()
        webviewwrestfed.loadUrl(
            "http://wrestlingfederationofindia.com/"
        )

        backbtnwrestfed.setOnClickListener {

            if (webviewwrestfed.canGoBack())
                webviewwrestfed.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtnwrestfed.setOnClickListener {

            if (webviewwrestfed.canGoForward())
                webviewwrestfed.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewwrestfedclient : WebViewClient(){

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
