package com.topekox.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAmigosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAmigosApplication.class, args);
    }

}
