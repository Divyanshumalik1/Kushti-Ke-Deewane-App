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
import kotlinx.android.synthetic.main.activity_wrestlingtvwebsiteactivity.*

class wrestlingtvwebsiteactivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrestlingtvwebsiteactivity)

        Toast.makeText(this,"PLEASE WAIT !",Toast.LENGTH_LONG).show()


        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        webviewwrestlingtvweb.settings.javaScriptEnabled = true
        webviewwrestlingtvweb.settings.setAppCacheEnabled(true)
        webviewwrestlingtvweb.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewwrestlingtvweb.settings.allowContentAccess = true
        webviewwrestlingtvweb.settings.allowFileAccess = true
        webviewwrestlingtvweb.settings.allowFileAccessFromFileURLs = true
        webviewwrestlingtvweb.webViewClient = MyWebviewwrestlingtvwebsiteclient()
        webviewwrestlingtvweb.loadUrl(
            "https://wrestlingtv.in/"
        )

        backbtnwrestlingtvweb.setOnClickListener {

            if (webviewwrestlingtvweb.canGoBack())
                webviewwrestlingtvweb.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtnwrestlingtvweb.setOnClickListener {

            if (webviewwrestlingtvweb.canGoForward())
                webviewwrestlingtvweb.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewwrestlingtvwebsiteclient : WebViewClient(){

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
