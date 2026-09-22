package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Good morning from Karan.";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Goodbye from Karan.";
    }
}
