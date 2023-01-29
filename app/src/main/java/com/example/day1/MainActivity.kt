package com.example.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvview = findViewById<TextView>(R.id.tvview)
        val btn = findViewById<Button>(R.id.btn)

        val random_no = Random.nextInt(1,100)
        tvview.text = random_no.toString()
        btn.setOnClickListener {
            val intent = Intent(this,activityb::class.java)
            intent.putExtra("Random", random_no)
//            putextra function 1st parameter is identifier and 2nd is the actual value to be passed
            startActivity(intent)

        }



    }
}