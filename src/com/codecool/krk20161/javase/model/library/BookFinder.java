package com.codecool.krk20161.javase.model.library;

import com.codecool.krk20161.javase.model.Author;
import com.codecool.krk20161.javase.model.Book;
import java.util.List;

public interface BookFinder {
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(Author author);
}
