package com.mini.project.weather_app.controller;

import com.mini.project.weather_app.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    //Field based injection
   // @Autowired
    private WeatherService businessLogic;

    //Constructor based injection. This is recommended way
 public WeatherController (WeatherService businessLogic) {
     this.businessLogic = businessLogic;
    }

    @GetMapping("/bycity")
    public String getWeatherByCityName(@RequestParam String cityName){

        return businessLogic.getWeatherDetails(cityName);
    }
}
