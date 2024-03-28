package com.beta1.beta1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//hello
@RestController
@CrossOrigin
public class HomeController {
    @GetMapping
    public String greeting(){
        return" Welcome to the prime services";
    }
}
