package com.beok.dontkeepactivitiestest

import android.app.Application
import android.util.Log

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("beokbeok", "onCreate: MyApplication")
    }
}