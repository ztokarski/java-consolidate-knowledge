package com.codecool.krk20161.javase.model;

import java.util.List;

public interface BookFinder {

    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(Author author);

}
