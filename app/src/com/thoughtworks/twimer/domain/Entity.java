package com.thoughtworks.twimer.domain;

public class Entity {
    private String name;
    private String code;

    public Entity(String code, String name) {

        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}