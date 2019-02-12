package com.example.colory

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {
    companion object {
        const val MY_RESULT_KEY = "RESULT"
        const val MESSAGE_KEY = "MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnred = findViewById<Button>(R.id.btnredLayout)
        var btngreen = findViewById<Button>(R.id.btngreenLayout)
        var btnorange = findViewById<Button>(R.id.btnorangeLayout)
        var btnpurple = findViewById<Button>(R.id.btnpurpleLayout)
        var btnyellow = findViewById<Button>(R.id.btnyellowLayout)
        var btnblue = findViewById<Button>(R.id.btnblueLayout)

        btnred.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btngreen.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btnorange.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btnpurple.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btnyellow.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btnblue.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
