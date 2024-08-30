package com.example.ProductServiceAug24.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentWeather {

    private Coord coord;
    private Weather[] weather;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    private Sys sys;

    private int visibility;
    private String base;
    private int dt;
    private int timezone;
    private int id;
    private String name;
    private int cod;
}

