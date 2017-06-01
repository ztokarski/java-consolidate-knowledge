package com.codecool.krk20161.javase.model.library;
import com.codecool.krk20161.javase.model.Book;
import com.codecool.krk20161.javase.model.Author;
import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private ArrayList<Book> books;

    public Catalog() {
        setBooks(books);
    }

    private void setBooks(ArrayList<Book> books) {
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        this.books.add(book);
    }


    public List<Book> searchByTitle(String title) {
        List<Book> bookByTitle = new ArrayList<>();

        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                bookByTitle.add(book);
            }
        }
        return bookByTitle;
    }

    public List<Book> searchByAuthor(Author author) {
        List<Book> bookByAuthor = new ArrayList<>();

        for (Book book : this.books) {
            if (book.getAuthor().getName().equals(author.getName())) {
                bookByAuthor.add(book);
            }
        }
        return bookByAuthor;
    }
}
