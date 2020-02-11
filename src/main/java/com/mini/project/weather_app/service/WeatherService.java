package com.mini.project.weather_app.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherService {

    public static final String APPID = "APPID";
    public static final String KEY = "41104c82131337474108f249462592be";
    public static final String QUERY_KEY = "q";
    public static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather";

    private RestTemplate restTemplate = new RestTemplate();

    public String getWeatherDetails(String cityName) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(WEATHER_URL)
                .queryParam(QUERY_KEY, cityName)
                .queryParam(APPID, KEY);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                String.class);
        return response.getBody().toString();
    }
}
