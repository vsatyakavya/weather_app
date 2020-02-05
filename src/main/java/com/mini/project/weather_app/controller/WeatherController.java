package com.mini.project.weather_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping("/bycity")
    public String getWeatherByCityName(@RequestParam String cityName){
        return" my first java project" + cityName;
    }
}
