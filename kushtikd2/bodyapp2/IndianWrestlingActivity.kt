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
import kotlinx.android.synthetic.main.activity_indian_wrestling.*

class IndianWrestlingActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indian_wrestling)



        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


        webviewindianwrestlingdoc.settings.javaScriptEnabled = true
        webviewindianwrestlingdoc.settings.setAppCacheEnabled(true)
        webviewindianwrestlingdoc.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewindianwrestlingdoc.settings.allowContentAccess = true
        webviewindianwrestlingdoc.settings.allowFileAccess = true
        webviewindianwrestlingdoc.settings.allowFileAccessFromFileURLs = true
        webviewindianwrestlingdoc.webViewClient = MyWebviewindianwrestdocclient()
        webviewindianwrestlingdoc.loadUrl(
            "https://www.youtube.com/playlist?list=PL4WzYyAVrxy_B-O7K8eD-xXgcnmqUfumF"
        )

        backbtnindiawrestlingdoc.setOnClickListener {

            if (webviewindianwrestlingdoc.canGoBack())
                webviewindianwrestlingdoc.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtnindianwrestlingdoc.setOnClickListener {

            if (webviewindianwrestlingdoc.canGoForward())
                webviewindianwrestlingdoc.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewindianwrestdocclient : WebViewClient(){

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
