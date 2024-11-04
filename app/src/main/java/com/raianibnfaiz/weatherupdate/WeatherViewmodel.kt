package com.raianibnfaiz.weatherupdate

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "WeatherViewmodel"
class WeatherViewmodel: ViewModel(){
    
        fun getWeather(city: String){
            Log.d(TAG, "getWeather: $city")
        }
}