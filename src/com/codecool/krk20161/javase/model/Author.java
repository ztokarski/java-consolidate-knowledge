package com.codecool.krk20161.javase.model;


public class Author extends Person {
    private String name;
    private String biography;

    public Author(String name) {
        super(name);
    }

    public Author(String name, String biography) {
        super(name);
        setBiography(biography);
    }

    public String getBiography() {
        return this.biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
