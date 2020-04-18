package com.kushtikd2.bodyapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class Splash_Activity1 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_1)

//        val num = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
//        {num.createNotificationChannel(NotificationChannel("first","default",NotificationManager.IMPORTANCE_DEFAULT))}

//        val i = Intent()
//        i.action = Intent.ACTION_VIEW
//        i.data = Uri.parse("https://www.youtube.com/channel/UCcbBDuVQ1B6CEUiNPQ4DU0Q")
//
//        val pi = PendingIntent.getActivity(this,123, i ,PendingIntent.FLAG_UPDATE_CURRENT)
//
//        val i1 = Intent()
//        i1.action = Intent.ACTION_VIEW
//        i1.data = Uri.parse("https://instagram.com/kushtikedeewane?igshid=plzxb9spuu5k")
//
//        val pi1 = PendingIntent.getActivity(this,123, i1 ,PendingIntent.FLAG_UPDATE_CURRENT)
//
//
//        val clicknotification = NotificationCompat.Builder(this,"first")
//            .setContentTitle("WELCOME TO KUSHTI KE DEEWANE")
//            .setContentText("Click the buttons below to visit our Channels")
//            .addAction(123,"YOUTUBE CHANNEL",pi)
//            .addAction(123,"INSTAGRAM ",pi1)
//            .setSmallIcon(R.drawable.kushtikdicon1)
//            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//            .build()
//
//        num.notify(1,clicknotification)


        Handler().postDelayed({
            startActivity(Intent(this,FirstPage::class.java))
            finish()

        },2000)

    }
}
