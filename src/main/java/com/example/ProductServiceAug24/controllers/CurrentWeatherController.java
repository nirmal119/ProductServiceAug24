package com.example.ProductServiceAug24.controllers;

import com.example.ProductServiceAug24.models.CurrentWeather;
import com.example.ProductServiceAug24.services.CurrentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentWeatherController {

    @Autowired
    CurrentWeatherService currentWeatherService;

    @GetMapping("/weather/{lat}/{lon}")
    public ResponseEntity<CurrentWeather> getCurrentWeather(@PathVariable("lat") double lat, @PathVariable("lon") double lon) {
        CurrentWeather currentWeather = currentWeatherService.getCurrentWeather(lat, lon);
        return ResponseEntity.ok(currentWeather);
    }
}
