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
import kotlinx.android.synthetic.main.activity_live_dangal.*

class LiveDangalActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_dangal)


        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


        webviewdangallive.settings.javaScriptEnabled = true
        webviewdangallive.settings.setAppCacheEnabled(true)
        webviewdangallive.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewdangallive.settings.allowContentAccess = true
        webviewdangallive.settings.allowFileAccess = true
        webviewdangallive.settings.allowFileAccessFromFileURLs = true

        webviewdangallive.webViewClient = MyWebviewdangalliveclient()



        webviewdangallive.loadUrl(
            //"https://kushtikedeewane.blogspot.com/2019/08/kushti-dangal-live-wrestling-live.html?m=1"
        "https://www.youtube.com/playlist?list=PL4WzYyAVrxy8iOoxycDmbcV4Vp59X0wte"
        )

        backbtndangallive.setOnClickListener {

            if (webviewdangallive.canGoBack())
                webviewdangallive.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtndangallive.setOnClickListener {

            if (webviewdangallive.canGoForward())
                webviewdangallive.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewdangalliveclient : WebViewClient(){

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
