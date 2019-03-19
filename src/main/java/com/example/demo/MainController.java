package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
@CrossOrigin("*")
public class MainController {


    @RequestMapping(value = "/get")
    public String getMessage(){
        System.out.println("Hello World");
        return "Helloworld";
    }
}
