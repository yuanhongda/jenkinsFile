package com.example.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping(value = "/say", name = "返回Hello World")
    public String hello(@RequestParam(value = "name", required = false) String name) {
        return String.format("Hello %s! ", name == null ? "World" : name);
    }
}

