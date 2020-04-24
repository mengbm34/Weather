package com.weather.android.logic.network

import com.weather.android.WeatherApplication
import com.weather.android.logic.dao.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${WeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlace(@Query("query")query:String): Call<PlaceResponse>
}