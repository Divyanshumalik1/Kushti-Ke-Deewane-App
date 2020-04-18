package com.kushtikd2.bodyapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_workout.*

class WorkoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout)


      wbutton.setOnClickListener {

          startActivity(Intent(this, WrestlingActivity::class.java))
      }

        crossbutton.setOnClickListener {

            startActivity(Intent(this, CrossfitActivity::class.java))
        }

        yogabun.setOnClickListener {

            startActivity(Intent(this, YogaActivity::class.java))
        }


//            val intent = Intent()
//            intent.action = Intent.ACTION_VIEW
//            intent.data = Uri.parse("https://www.youtube.com/watch?v=iqY-4kBAiHw")
//            startActivity(intent)
//        }




    }



}
