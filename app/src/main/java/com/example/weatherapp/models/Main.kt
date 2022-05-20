package com.example.weatherapp.models

import java.io.Serializable

data class Main(
    val feels_like: Double,
    val humidity: Int,
    val pressure: Int,
    val temp: Double,
    val temp_max: Double,
    val temp_min: Double,
    val sea_level: Double,
    val grnd_level: Double
) : Serializable