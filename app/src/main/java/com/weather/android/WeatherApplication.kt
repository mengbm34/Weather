package com.weather.android

import android.app.Application
import android.content.Context

class WeatherApplication : Application() {

    companion object{
        lateinit var context: Context
        //彩云天气令牌值
        const val TOKEN = "RDAELzUbSWleFmn4"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}