package com.chrvnixx.FirstSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloGet(){
        return "Hello World!";
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(String name){
        return new HelloResponse("Hello" + name + "!");
    };
}
