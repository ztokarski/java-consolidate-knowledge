package com.codecool.krk20161.javase.model;

import com.codecool.krk20161.javase.exception.AlreadyInCatalogException;
import java.util.ArrayList;
import java.util.List;


public class Catalog implements BookFinder {

    private ArrayList<Book> books;

    public Catalog() {
        setBooks(books);
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        List<String> title = new ArrayList<>();
        for (Book checkbook : this.books) {
            title.add(checkbook.getTitle());
        }
        if (title.contains(book.getTitle())) {
            throw new AlreadyInCatalogException();
        } else {
            this.books.add(book);
        }
    }

    @Override
    public List<Book> searchByTitle(String title) {
        List<Book> bookByTitle = new ArrayList<>();

        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                bookByTitle.add(book);
            }
        }
        return bookByTitle;
    }

    @Override
    public List<Book> searchByAuthor(Author author) {
        List<Book> bookByAuthor = new ArrayList<>();

        for (Book book : this.books) {
            if (book.getAuthor().getName().equals(author.getName())) {
                bookByAuthor.add(book);
            }
        }
        return bookByAuthor;
    }

    public void remove(Book bookToRemove) {
        for (Book book : this.books) {
            if (book.getTitle().equals(bookToRemove.getTitle()) &&
                book.getAuthor().getName().equals(bookToRemove.getAuthor().getName())) {
                this.books.remove(book);
            }
        }
    }

}

