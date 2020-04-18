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

class CrossfitActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crossfit)

        MobileAds.initialize(this,"ca-app-pub-4071969817294756~3638841429")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        webviewcross.settings.javaScriptEnabled = true
        webviewcross.settings.setAppCacheEnabled(true)
        webviewcross.settings.javaScriptCanOpenWindowsAutomatically = true
        webviewcross.settings.allowContentAccess = true
        webviewcross.settings.allowFileAccess = true
        webviewcross.settings.allowFileAccessFromFileURLs = true

        webviewcross.webViewClient = MyWebviewcrossfitclient()


        webviewcross.loadUrl(
            "https://www.youtube.com/playlist?list=PL4WzYyAVrxy8WNygIcLv3KkjDJvZZBxCq"
        //"https://www.youtube.com/playlist?list=PLA5TpPZ_1xHU6l_3OtU_jp40_v5xcp9fb"
        )

        backbtncrossfit.setOnClickListener {

            if (webviewcross.canGoBack())
                webviewcross.goBack()
            else(Toast.makeText(this,"PREVIOUS PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }



        forwardbtncrossfit.setOnClickListener {

            if (webviewcross.canGoForward())
                webviewcross.goForward()
            else(Toast.makeText(this,"NEXT PAGE IS NOT AVAILABLE", Toast.LENGTH_SHORT).show())

        }


    }

    class MyWebviewcrossfitclient : WebViewClient(){

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
