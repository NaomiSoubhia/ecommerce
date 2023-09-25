package com.github.naomisoubhia.ecommerce.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.convert.ValueConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class PingController {
	

	@Value("${mensagem}")
	 private String mens;

    @GetMapping("/ping")
    public String ping() {
        return "ping pong: " + mens;
    }
}
