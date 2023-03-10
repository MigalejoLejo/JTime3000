package com.migo.jtime3000.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testController")
public class TestController {

    @GetMapping("/hi")
    public String sayHello(){
        return "Hello World";
    }

}
