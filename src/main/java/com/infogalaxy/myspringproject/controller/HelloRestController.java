package com.infogalaxy.myspringproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping(value={"","/","/home"})
    public String sayHello() {
        return "Hello from InfoGalaxy Rest Controller";
    }
}
