package com.codecool.krk20161.javase.model;


public class Author {
    private String name;
    private String biography;

    public Author(String name) {
        setName(name);
    }

    public Author(String name, String biography) {
        setName(name);
        setBiography(biography);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getBiography() {
        return this.biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
