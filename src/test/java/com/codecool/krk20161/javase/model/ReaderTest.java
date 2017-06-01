//package com.codecool.krk20161.javase.model;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ReaderTest {
//
//    @Test
//    @DisplayName("Name is set by constructor")
//    void testNameIsSetByConstructor() {
//        String name = "John Kovalski";
//        Reader reader = new Reader(name);
//
//        assertEquals(name, reader.getName());
//    }
//
//    @Test
//    @DisplayName("Read list of book is empty by default")
//    void testReadListOfBookByDefault() {
//        Reader reader = new Reader(null);
//
//        assertEquals(0, reader.getRead().size());
//    }
//
//    @Test
//    @DisplayName("Read list of book is set by constructor")
//    void testReadIsSetByConstructor() {
//        List<Book> read = new ArrayList<Book>();
//        Reader reader = new Reader(null, read);
//
//        assertSame(read, reader.getRead());
//    }
//
//    @Nested
//    @DisplayName("with some read books")
//    class WithReadBooks {
//        Author author1 = new Author("Norman Chidley");
//        Author author2 = new Author("Dex Choudhury");
//        Author author3 = new Author("Corene Gian");
//
//        Book book1 = new Book("Foreigner Of Twilight", author1);
//        Book book2 = new Book("Mouse Of Greatness", author2);
//        Book book3 = new Book("Mice Of The Lost Ones", author3);
//        Book book4 = new Book("Aliens Without Flaws", author2);
//        Book book5 = new Book("Kings And Creators", author1);
//
//        Reader reader;
//
//        @BeforeEach
//        void setUp() {
//            List<Book> read = new ArrayList<Book>();
//            read.add(book1);
//            read.add(book2);
//            read.add(book3);
//            read.add(book4);
//            read.add(book5);
//
//            this.reader = new Reader(null, read);
//        }
//
//        @Test
//        @DisplayName("Book is found by title")
//        void testSearchBookByTitle() {
//            List<Book> expected = Arrays.asList(this.book3);
//
//            assertEquals(expected, this.reader.searchByTitle("Mice Of The Lost Ones"));
//        }
//
//        @Test
//        @DisplayName("Book is not found by title")
//        void testSearchBookByTitleThatDoesnNotExists() {
//            assertEquals(
//                    new ArrayList<Book>(),
//                    this.reader.searchByTitle("Some title that does not exists on read list"))
//            ;
//        }
//
//        @Test
//        @DisplayName("Book is found by author")
//        void testSearchByAuthor() {
//            List<Book> expected = Arrays.asList(this.book2, this.book4);
//            Author author = new Author("Dex Choudhury");
//
//            assertEquals(expected, this.reader.searchByAuthor(author));
//        }
//
//        @Test
//        @DisplayName("Book is not found by author")
//        void testSearchBookByAuthorThatDoesnNotExists() {
//            Author author = new Author("Unknown");
//
//            assertEquals(new ArrayList<Book>(), this.reader.searchByAuthor(author));
//        }
//    }
//
//}