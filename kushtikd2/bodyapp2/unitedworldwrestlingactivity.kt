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
import kotlinx.android.synthetic.main.activity_unitedworldwrestlingactivity.*

class unitedworldwrestlingactivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unitedworldwrestlingactivity)

        Toast.makeText(this,"PLEASE WAIT !",Toast.LENGTH_LONG).show()

        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        webviewunited.settings.javaScriptEnabled = true
        webviewunited.settings.setAppCacheEnabled(true)
        webviewunited.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewunited.settings.allowContentAccess = true
        webviewunited.settings.allowFileAccess = true
        webviewunited.settings.allowFileAccessFromFileURLs = true
        webviewunited.webViewClient = MyWebviewunitedclient()
        webviewunited.loadUrl(
            "https://unitedworldwrestling.org/"
        )

        backbtnunited.setOnClickListener {

            if (webviewunited.canGoBack())
                webviewunited.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtnunited.setOnClickListener {

            if (webviewunited.canGoForward())
                webviewunited.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewunitedclient : WebViewClient(){

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
