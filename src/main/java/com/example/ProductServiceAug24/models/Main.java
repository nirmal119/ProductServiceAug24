package com.example.ProductServiceAug24.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {

    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;
    private int sea_level;
    private int grnd_level;
}
