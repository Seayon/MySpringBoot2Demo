package com.saeyon.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello01() {
        return "Hello, Spring Boot 2";
    }

    //同样情况下先去找 Controller,找不到才去找静态资源
    @GetMapping("banner-1.jpg")
    public String he() {
        return "aaa";
    }
}
