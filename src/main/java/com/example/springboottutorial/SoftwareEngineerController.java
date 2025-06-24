package com.example.springboottutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineer() {

        return List.of(new SoftwareEngineer(1, "Siddhant", "React + Spring Boot"),
                new SoftwareEngineer(2, "Rushaan", "C++"));

    }
}
