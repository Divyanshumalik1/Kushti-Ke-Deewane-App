package com.kushtikd2.bodyapp2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_first_page.*

class FirstPage : YouTubeBaseActivity() {

    companion object {
        val YOUTUBE_API_KEY: String = "AIzaSyBDlD6j0nMvwYEmCA-bkPeXYZ_ssMNLKes"
        val VIDEO_ID1: String = "PLA5TpPZ_1xHU6l_3OtU_jp40_v5xcp9fb"
    }

    lateinit var youtubeplayerinitfirstpage : YouTubePlayer.OnInitializedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        buttonwhatsapp.setOnClickListener {
            val i2 = Intent()
            i2.action = Intent.ACTION_VIEW
            i2.data = Uri.parse("https://wa.me/918287320544")
            startActivity(i2)
        }

howtousebtn.setOnClickListener {
    startActivity( Intent(this,howtoactivity::class.java))
}

        buttoninsta.setOnClickListener { val i = Intent()
        i.action = Intent.ACTION_VIEW
        i.data = Uri.parse("https://instagram.com/kushtikd?igshid=s1ffks7kpgr2")
        startActivity(i)
        }

        buttonyoutube.setOnClickListener {
            val i1 = Intent()
        i1.action = Intent.ACTION_VIEW
        i1.data = Uri.parse("https://www.youtube.com/channel/UCcbBDuVQ1B6CEUiNPQ4DU0Q")
            startActivity(i1)
        }

//        buttonfacebook.setOnClickListener {  }


        initfirstpage()

        startappbtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

    private fun initfirstpage() {
        youtubeplayerinitfirstpage = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
                p1?.loadPlaylist(VIDEO_ID1)
            }

            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }

        firstpageyoutubeplayer.initialize(YOUTUBE_API_KEY,youtubeplayerinitfirstpage)
    }
}
