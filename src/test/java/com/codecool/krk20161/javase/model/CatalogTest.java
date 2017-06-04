package com.codecool.krk20161.javase.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.codecool.krk20161.javase.exception.AlreadyInCatalogException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CatalogTest {

    @Test
    @DisplayName("List of books is empty by default")
    void testEmptyListOfBooksByDefault() {
        Catalog catalog = new Catalog();

        assertEquals(new ArrayList<Book>(), catalog.getBooks());
    }

    @Test
    @DisplayName("Add book to catalog")
    void testAddBookToTheList() {
        Book book = new Book(null, null);
        Catalog catalog = new Catalog();
        catalog.add(book);

        List<Book> expected = Arrays.asList(book);
        assertEquals(expected, catalog.getBooks());
    }


    @Test
    @DisplayName("Can't add book with same title twice")
    void testCannotAddBookWithSameTitleTwice() {
        final Catalog catalog = new Catalog();

        Book first = new Book("Book title", null);
        catalog.add(first);

        Book second = new Book("Book title", null);
        assertThrows(AlreadyInCatalogException.class, () -> catalog.add(second));
    }

    @Nested
    @DisplayName("when books are in catalog")
    class WhenBooksInCatalog {

        Author author1 = new Author("Norman Chidley");
        Author author2 = new Author("Dex Choudhury");
        Author author3 = new Author("Corene Gian");

        Book book1 = new Book("Foreigner Of Twilight", author1);
        Book book2 = new Book("Mouse Of Greatness", author2);
        Book book3 = new Book("Mice Of The Lost Ones", author3);
        Book book4 = new Book("Aliens Without Flaws", author2);
        Book book5 = new Book("Kings And Creators", author1);

        Catalog catalog;

        @BeforeEach
        void setUp() {
            this.catalog = new Catalog();
            this.catalog.add(this.book1);
            this.catalog.add(this.book2);
            this.catalog.add(this.book3);
            this.catalog.add(this.book4);
            this.catalog.add(this.book5);
        }

        @Test
        @DisplayName("Book is found by title")
        void testSearchByTitle() {
            List<Book> expected = Arrays.asList(this.book1);

            assertEquals(expected, this.catalog.searchByTitle("Foreigner Of Twilight"));
        }

        @Test
        @DisplayName("Book is not found by title")
        void testBookNotFoundByTitle() {
            assertEquals(new ArrayList<Book>(), this.catalog.searchByTitle("Unknown title"));
        }

        @Test
        @DisplayName("Book is found by author")
        void testSearchByAuthor() {
            List<Book> expected = Arrays.asList(this.book1, this.book5);
            Author author = new Author("Norman Chidley");

            assertEquals(expected, this.catalog.searchByAuthor(author));
        }

        @Test
        @DisplayName("Book is not found by author")
        void testBookNotFoundByAuthor() {
            Author author = new Author("Unknown");

            assertEquals(new ArrayList<Book>(), this.catalog.searchByAuthor(author));
        }

        @Test
        @DisplayName("Book is removed by title")
        void testBookIsRemoved() {
            Author author = new Author("Dex Choudhury");
            Book bookToRemove = new Book("Aliens Without Flaws", author);
            this.catalog.remove(bookToRemove);

            assertEquals(4, this.catalog.getBooks().size());
        }

        @Test
        @DisplayName("Book is not found after is removed")
        void testBookNotFoundAfterIsRemoved() {
            Author author = new Author("Dex Choudhury");
            Book bookToRemove = new Book("Aliens Without Flaws", author);
            this.catalog.remove(bookToRemove);

            assertEquals(new ArrayList<Book>(), this.catalog.searchByTitle(bookToRemove.getTitle()));
        }

        @Test
        @DisplayName("Book is not removed when title and author doesn't match")
        void testBookNotRemovedIdTitleAndAuthorNotEquals() {
            Author author = new Author("Unknown");
            Book bookToRemove = new Book("Aliens Without Flaws", author);
            this.catalog.remove(bookToRemove);

            assertEquals(5, this.catalog.getBooks().size());
        }
    }

}