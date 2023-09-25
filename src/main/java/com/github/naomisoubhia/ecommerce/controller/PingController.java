package com.github.naomisoubhia.ecommerce.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@RestController
@RequestMapping
public class PingController {
	


    @GetMapping("/ping")
    public String ping() {
        return "ping pong: " ;
    }
}
