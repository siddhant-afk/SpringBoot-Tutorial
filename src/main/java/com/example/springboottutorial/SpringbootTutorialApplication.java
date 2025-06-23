package com.example.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTutorialApplication.class, args);
    }
@GetMapping
    public String hello(){

        return "<h1 style=\"color : red\"> Hello World! </h1>";
    }
}
