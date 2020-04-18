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
import kotlinx.android.synthetic.main.activity_motivation.*

class MotivationActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motivation)


        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        webviewmotivation.settings.javaScriptEnabled = true
        webviewmotivation.settings.setAppCacheEnabled(true)
        webviewmotivation.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewmotivation.settings.allowContentAccess = true
        webviewmotivation.settings.allowFileAccess = true
        webviewmotivation.settings.allowFileAccessFromFileURLs = true
        webviewmotivation.webViewClient = MyWebviewmotivationlient()
        webviewmotivation.loadUrl(
            "https://www.youtube.com/playlist?list=PL4WzYyAVrxy-CUh_9HSeWMiblzVN5H24m"
        )

        backbtnmotivation.setOnClickListener {

            if (webviewmotivation.canGoBack())
                webviewmotivation.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtnmotivation.setOnClickListener {

            if (webviewmotivation.canGoForward())
                webviewmotivation.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewmotivationlient : WebViewClient(){

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

