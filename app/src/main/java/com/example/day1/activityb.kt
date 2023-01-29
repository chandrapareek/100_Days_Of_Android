package com.example.day1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class activityb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityb)
        val tvview = findViewById<TextView>(R.id.tvview)
        val btn = findViewById<Button>(R.id.btn)



        val intent = intent
//        intent gets the intent of the activity
        val num = intent.getIntExtra("Random",0)
//        then intent.getintextra gets the integer passed by the first activity with identifier random and stores it in num
        tvview.setText(num.toString())
        btn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}