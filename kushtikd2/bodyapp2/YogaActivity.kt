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
import kotlinx.android.synthetic.main.activity_crossfit.*
import kotlinx.android.synthetic.main.activity_yoga.*

class YogaActivity : AppCompatActivity() {

    lateinit var mAdView : AdView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)

        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)



        webviewyoga.settings.javaScriptEnabled = true
        webviewyoga.settings.setAppCacheEnabled(true)
        webviewyoga.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewyoga.settings.allowContentAccess = true
        webviewyoga.settings.allowFileAccess = true
        webviewyoga.settings.allowFileAccessFromFileURLs = true

        webviewyoga.webViewClient = MyWebviewyogaclient()


        webviewyoga.loadUrl(
            "https://www.youtube.com/playlist?list=PL4WzYyAVrxy_bxa66ZBpisj5tYbgU_Kur"
        )

        backbtnyoga.setOnClickListener {

            if (webviewcross.canGoBack())
                webviewcross.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtnyoga.setOnClickListener {

            if (webviewcross.canGoForward())
                webviewcross.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }
    }

    class MyWebviewyogaclient : WebViewClient(){

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
