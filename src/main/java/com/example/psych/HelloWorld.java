package com.example.psych;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class HelloWorld {
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }
}
