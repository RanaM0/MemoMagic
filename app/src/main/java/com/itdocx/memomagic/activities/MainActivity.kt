package com.itdocx.memomagic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

   val REQUEST_CODE_ADD_NOTE =1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = findViewById<ImageView>(R.id.iv_addNotes)

        img.setOnClickListener{

            val intent = Intent(this, CreateNotes::class.java)
            startActivity(intent)
        }
    }
}