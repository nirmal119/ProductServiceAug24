package com.example.ProductServiceAug24.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/show/{showId}/seat/{seatId}")
    public String helloWithName(@PathVariable("showId") String showId, @PathVariable("seatId") String seatID) {
        return "Hello " + showId + " " + seatID;
    }
}
