package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Greeting;
import com.example.demo.service.DateTimeService;
@RestController
public class HelloController {
    @Autowired
    private Greeting greetingService;
    @Autowired
    private DateTimeService dts;


    @GetMapping("/hello")
    public String greet(){
        return greetingService.sayHello();
    }

    @GetMapping("tym")
    public String tym(){
        return dts.getCurrentTime();
    }



}
