package com.example.ProductServiceAug24.services;

import com.example.ProductServiceAug24.models.CurrentWeather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CurrentWeatherService implements CurrentWeatherImp{

    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String API_KEY = "cc322d91d2aacf49430fed64c8ececb0";

    @Override
    public CurrentWeather getCurrentWeather(double lat, double lon) {

        String url = UriComponentsBuilder.fromHttpUrl(API_URL)
                .queryParam("lat", lat)
                .queryParam("lon", lat)
                .queryParam("appid", API_KEY)
                .toUriString();

        RestTemplate restTemplate = new RestTemplate();
//        CurrentWeather currentWeather = restTemplate.getForObject(url, CurrentWeather.class);
        return restTemplate.getForObject(url, CurrentWeather.class);
    }

}
