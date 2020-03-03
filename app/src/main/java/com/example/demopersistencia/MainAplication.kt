package com.example.demopersistencia

import com.facebook.stetho.Stetho
import android.app.Application
import android.os.Build


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // http://facebook.github.io/stetho/
        // chrome://inspect/#devices

        if(BuildConfig.DEBUG)
            Stetho.initializeWithDefaults(this)
    }
}