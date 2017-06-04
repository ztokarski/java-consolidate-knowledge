package com.codecool.krk20161.javase.model;

public class Book {

    private String title;
    private Author author;
    private String summary;

    public Book(String title, Author author) {
        setTitle(title);
        setAuthor(author);
    }

    public Book(String title, Author author, String summary) {
        setTitle(title);
        setAuthor(author);
        setSummary(summary);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
