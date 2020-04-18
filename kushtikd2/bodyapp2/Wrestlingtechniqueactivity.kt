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
import kotlinx.android.synthetic.main.activity_wrestlingtechniqueactivity.*

class Wrestlingtechniqueactivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrestlingtechniqueactivity)

        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        webviewtechnique.settings.javaScriptEnabled = true
        webviewtechnique.settings.setAppCacheEnabled(true)
        webviewtechnique.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewtechnique.settings.allowContentAccess = true
        webviewtechnique.settings.allowFileAccess = true
        webviewtechnique.settings.allowFileAccessFromFileURLs = true
        webviewtechnique.webViewClient = MyWebviewtechniqueclient()
        webviewtechnique.loadUrl(
            "https://m.youtube.com/playlist?list=PLMMxG3zRihfrjJikwOYY_G8qPKqprDH-z"
        )

        backbtntechnique.setOnClickListener {

            if (webviewtechnique.canGoBack())
                webviewtechnique.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtntechnique.setOnClickListener {

            if (webviewtechnique.canGoForward())
                webviewtechnique.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewtechniqueclient : WebViewClient(){

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
