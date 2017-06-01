package com.codecool.krk20161.javase.model;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person implements BookFinder{
    private String name;
    private List<Book> read;

    public Reader(String name) {
        super(name);
        this.read = new ArrayList<>();
    }

    public Reader(String name, List<Book> read) {
        super(name);
        setRead(read);
    }

    public void setRead(List<Book> read) {
        this.read = read;
    }

    public List<Book> getRead() {
        return read;
    }

    @Override
    public List<Book> searchByTitle(String title) {
        List<Book> bookByTitle = new ArrayList<>();

        for (Book book : this.read) {
            if (book.getTitle().equals(title)) {
                bookByTitle.add(book);
            }
        }
        return bookByTitle;
    }

    @Override
    public List<Book> searchByAuthor(Author author) {
        List<Book> bookByAuthor = new ArrayList<>();

        for (Book book : this.read) {
            if (book.getAuthor().getName().equals(author.getName())){
                bookByAuthor.add(book);
            }
        }return bookByAuthor;
    }

}
