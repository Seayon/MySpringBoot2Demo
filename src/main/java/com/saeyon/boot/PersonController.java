package com.saeyon.boot;

import com.saeyon.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    Person person;

    @GetMapping("/person")
    public Person person() {
        System.out.println("person = " + person);
        return person;
    }
}
