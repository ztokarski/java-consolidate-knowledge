package com.codecool.krk20161.javase.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    @DisplayName("Name is set by constructor")
    void testConstructorSetsNameInstanceVariable() {
        String name = "Sourabh Sharma";
        Author author = new Author(name);

        assertEquals(name, author.getName());
    }

    @Test
    @DisplayName("Biography is set by constructor")
    void testConstructorSetsBiographyInstanceVariable() {
        String biography = "Sourabh Sharma has been developing applications for over 10 years. " +
                "He is a valued expert in creating, implementing, and testing multi-layered web applications.";
        Author author = new Author(null, biography);

        assertEquals(biography, author.getBiography());
    }

    @Nested
    @DisplayName("when already instantiated")
    class WhenAlreadyInstantiated {
        private Author author;

        @BeforeEach
        void setUp() {
            String name = "Sourabh Sharma";
            String biography = "Sourabh Sharma has been developing applications for over 10 years. " +
                    "He is a valued expert in creating, implementing, and testing multi-layered web applications.";
            this.author = new Author(name, biography);
        }

        @Test
        @DisplayName("Biography can be modified by setter")
        void testBiographySetter() {
            String newBiography = "This is new, very short biography...";
            this.author.setBiography(newBiography);

            assertEquals(newBiography, this.author.getBiography());
        }

    }

}