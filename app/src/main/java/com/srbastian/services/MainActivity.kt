package com.srbastian.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var startClasicService : Button
    lateinit var jobIntentService : Button
    lateinit var stopClasicService : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startClasicService = findViewById(R.id.clasic)
        stopClasicService = findViewById(R.id.stopService)
        jobIntentService = findViewById(R.id.jobIntent)

        //This service runs in the main thread
        startClasicService.setOnClickListener {
            val intent = Intent(this@MainActivity, ClasicService :: class.java)
            startService(intent)
        }
        // this one stops the ClasicService
        stopClasicService.setOnClickListener {
            val intent = Intent(this@MainActivity, ClasicService :: class.java)
            stopService(intent)
        }
        // async Service this one creates his own tread to run
        jobIntentService.setOnClickListener {
            val intent = Intent(this@MainActivity, JobIntentServiceExample::class.java)
            JobIntentServiceExample.backGroundService(this@MainActivity, intent)
        }
    }
}