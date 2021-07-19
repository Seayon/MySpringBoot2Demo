package com.saeyon.boot;

import com.saeyon.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

    @RequestMapping("/h")
    public String hello01() {
        return "World!";
    }

    @Autowired
    Car car;

    @GetMapping("/car")
    public Car car() {
        return car;
    }
}
