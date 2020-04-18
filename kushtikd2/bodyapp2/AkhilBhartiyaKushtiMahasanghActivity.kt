package com.kushtikd2.bodyapp2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_akhil_bhartiya_kushti_mahasangh.*

class AkhilBhartiyaKushtiMahasanghActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akhil_bhartiya_kushti_mahasangh)



        button2.setOnClickListener {
            val i1abkm = Intent()
            i1abkm.action = Intent.ACTION_VIEW
            i1abkm.data = Uri.parse("https://www.Abkm.in")
            startActivity(i1abkm)

        }
        buttoninstaabkm.setOnClickListener {  val i3abkm = Intent()
        i3abkm.action = Intent.ACTION_VIEW
            i3abkm.data = Uri.parse("https://instagram.com/abkm.in?igshid=bv59mr3hujdl")
            startActivity(i3abkm)

        }
        buttonfacebookabkm.setOnClickListener {
            val i2abkm = Intent()
            i2abkm.action = Intent.ACTION_VIEW
            i2abkm.data = Uri.parse("https://www.facebook.com/akhilbhartiyakushtimahasangh/")
            startActivity(i2abkm)
        }

    }
}
