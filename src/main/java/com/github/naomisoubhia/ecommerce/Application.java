package com.github.naomisoubhia.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

   @RequestMapping("/")
    public RedirectView redirect() {
        return new RedirectView("/swagger-ui.html");
    }
}
