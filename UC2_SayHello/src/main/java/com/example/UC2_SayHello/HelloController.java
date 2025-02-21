package com.example.UC2_SayHello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    String sayHello(@RequestParam String name){
        return "Hello, " + name + "! Welcome to BridgeLabz.";
    }
}
