package com.example.infoapplication

import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val agenai= findViewById< ImageView>(R.id.imageView)
        agenai.setOnClickListener {
            intent= Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)
        }

        val appdev= findViewById< ImageView>(R.id.imageView2)
        appdev.setOnClickListener {
            intent= Intent(applicationContext, MainActivity4::class.java)
            startActivity(intent)
        }

        val webdev= findViewById< ImageView>(R.id.imageView4)
        webdev.setOnClickListener {
            intent= Intent(applicationContext, MainActivity5::class.java)
            startActivity(intent)
        }

        val machler= findViewById< ImageView>(R.id.imageView3)
        machler.setOnClickListener {
            intent= Intent(applicationContext, MainActivity6::class.java)
            startActivity(intent)
        }

        val phone=findViewById<TextView>(R.id.textView10)
        phone.setOnClickListener {
            val intent= Intent()
            intent.setAction(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:00000"))
            startActivity(intent)
        }

        val insta=findViewById<ImageView>(R.id.imageView7)
        insta.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.instagram.com/")
            startActivity(intent)
        }

        val twitter=findViewById<ImageView>(R.id.imageView8)
        twitter.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://x.com/")
            startActivity(intent)
        }

        val youtube=findViewById<ImageView>(R.id.imageView9)
        youtube.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.youtube.com/")
            startActivity(intent)
        }
    }
}