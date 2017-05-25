package com.codecool.krk20161.javase.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertSame;

class LibraryTest {

    @Test
    @DisplayName("Catalog is empty by default")
    void testCatalogIsEmptyByDefault() {
        Library library = new Library();

        assertEquals(new ArrayList<Book>(), library.getCatalog().getBooks());
    }

    @Test
    @DisplayName("Catalog is set by setter")
    void testCatalogIsSetBySetter() {
        Catalog catalog = new Catalog();
        Library library = new Library();
        library.setCatalog(catalog);

        assertSame(catalog, library.getCatalog());
    }

}