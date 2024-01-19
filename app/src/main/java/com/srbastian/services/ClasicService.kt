package com.srbastian.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ClasicService : Service(){
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("Service", "Clasic Service is created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("Service", "Clasic Service is Started")
        Log.d("Threat", Thread.currentThread().name)
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Service", "Clasic Service is stoped")
    }

}