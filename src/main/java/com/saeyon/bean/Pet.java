package com.saeyon.bean;

import java.util.StringJoiner;

/**
 * 宠物
 */
public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pet.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
