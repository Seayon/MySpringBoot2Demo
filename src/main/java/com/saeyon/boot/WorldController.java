package com.saeyon.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

    @RequestMapping("/h")
    public String hello01() {
        return "World!";
    }

}
