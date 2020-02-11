package com.mini.project.weather_app.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public String getWeatherDetails(String cityName) {
        return "weather: " + cityName + " ......." ;
    }
}
