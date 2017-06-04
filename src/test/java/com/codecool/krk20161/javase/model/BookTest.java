package com.codecool.krk20161.javase.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    @DisplayName("Title is set by constructor")
    void testConstructorSetsTitleInstanceVariable() {
        String title = "Mastering Microservices with Java";
        Book book = new Book(title, null);

        assertEquals(title, book.getTitle());
    }

    @Test
    @DisplayName("Author is set by constructor")
    void testConstructorSetsAuthorInstanceVariable() {
        String authorName = "Sourabh Sharma";
        Author author = new Author(authorName);
        Book book = new Book(null, author);

        assertEquals(author, book.getAuthor());
    }

    @Test
    @DisplayName("Summary is set by constructor")
    void testConstructorSetsSummary() {
        String summary = "This is book's summary";
        Book book = new Book(null, null, summary);

        assertEquals(summary, book.getSummary());
    }

    @Nested
    @DisplayName("when instantiated")
    class WhenAlreadyInstantiated {
        Book book;

        @BeforeEach
        void setUp() {
            String title = "Mastering Microservices with Java";
            Author author = new Author(null, null);
            String summary = "This is book's summary";

            this.book = new Book(title, author, summary);
        }

        @Test
        @DisplayName("Test summary can be modified")
        void testSummaryCanBeModified() {
            String newSummary = "This is new summary for this book";
            this.book.setSummary(newSummary);

            assertEquals(newSummary, this.book.getSummary());
        }

    }

}