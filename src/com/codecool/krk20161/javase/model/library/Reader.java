package com.codecool.krk20161.javase.model.library;

import com.codecool.krk20161.javase.model.Author;
import com.codecool.krk20161.javase.model.Book;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> read;

    public Reader(String name) {
        setName(name);
        this.read = new ArrayList<>();
    }

    public Reader(String name, List<Book> read) {
        setName(name);
        setRead(read);
    }

    public void setRead(List<Book> read) {
        this.read = read;
    }


    public void setRead(ArrayList<Book> read) {
        this.read = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getRead() {
        return read;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> bookByTitle = new ArrayList<>();

        for (Book book : this.read) {
            if (book.getTitle().equals(title)) {
                bookByTitle.add(book);
            }
        }
        return bookByTitle;
    }



    public List<Book> searchByAuthor(Author author) {
        List<Book> bookByAuthor = new ArrayList<>();

        for (Book book : this.read) {
            if (book.getAuthor().getName().equals(author.getName())){
                bookByAuthor.add(book);
            }
        }return bookByAuthor;
    }


    @Override
    public String toString() {
        return getRead().toString();
    }
}
