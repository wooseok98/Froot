package com.example.FrootServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/go")
    public String go(){
        return "dkdk";
    }
}
