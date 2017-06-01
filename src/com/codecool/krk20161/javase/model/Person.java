package com.codecool.krk20161.javase.model;

public abstract class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
