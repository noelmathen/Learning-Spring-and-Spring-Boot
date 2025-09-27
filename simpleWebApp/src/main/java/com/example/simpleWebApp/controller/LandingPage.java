package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingPage {

    @RequestMapping("/")
    public String home(){
        return "This is the home page!";
    }

    @RequestMapping("/about")
    public String about(){
        return "ABOUT Page";
    }
}
