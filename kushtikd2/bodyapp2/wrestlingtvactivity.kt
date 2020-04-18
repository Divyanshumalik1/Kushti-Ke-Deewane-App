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
import kotlinx.android.synthetic.main.activity_wrestlingtvactivity.*

class wrestlingtvactivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrestlingtvactivity)

        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        webviewwrestlingtv.settings.javaScriptEnabled = true
        webviewwrestlingtv.settings.setAppCacheEnabled(true)
        webviewwrestlingtv.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewwrestlingtv.settings.allowContentAccess = true
        webviewwrestlingtv.settings.allowFileAccess = true
        webviewwrestlingtv.settings.allowFileAccessFromFileURLs = true
        webviewwrestlingtv.webViewClient = MyWebviewwrestlingtvclient()
        webviewwrestlingtv.loadUrl(
            "https://www.youtube.com/playlist?list=PL4WzYyAVrxy-Uy_TrgQEJQbgcrVmH3nho"
        )

        backbtnwrestlingtv.setOnClickListener {

            if (webviewwrestlingtv.canGoBack())
                webviewwrestlingtv.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtnwrestlingtv.setOnClickListener {

            if (webviewwrestlingtv.canGoForward())
                webviewwrestlingtv.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewwrestlingtvclient : WebViewClient(){

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
