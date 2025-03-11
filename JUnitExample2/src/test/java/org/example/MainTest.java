package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Test fixture
    private ArrayList<Integer> list;


    // Pre-test setup method (prefix)
    @BeforeEach
    void setUp() {
        list = new ArrayList<Integer>();
    }


    // Post test teardown method (postfix)
    @AfterEach
    void tearDown() { list = null; }


    /**
     * Test list type.
     * If the list is not of type integer we should get a ClassCastException error.
     * Success of this test means ClassCastException has been thrown.
     * Uses assertThrows.
     */
    @Test
    @DisplayName("List Type Test")
    void listType() {

        ArrayList list = new ArrayList();

        list.add("cat");
        list.add("dog");
        list.add(1);

        Exception exception = assertThrows(
                ClassCastException.class,
                () -> Main.findMin(list),
                "ClassCastException expected."
        );
    }


    /**
     * Test null list.
     * Uses assertThrows and assertEquals.
     * To check the functionality, update the exception throw statements in
     * Minimum.java list null check conditional.
     */
    @Test
    @DisplayName("Null List Test")
    void nullList() {

        list = null;

        Exception exception = assertThrows(
                NullPointerException.class,
                () -> Main.findMin(list),
                "NullPointerException expected" // Message is optional.
        );

        // Optional. To check whether the error messages match.
        assertEquals("NullPointer Exception. The list is null.", exception.getMessage());
    }


    /**
     * Test empty list.
     * Uses assertThrows and assertEquals.
     */
    @Test
    @DisplayName("Empty List Test")
    void emptyList() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Main.findMin(list),
                "IllegalArgumentException expected" // Message is optional.
        );

        // Optional. To check whether the error messages match.
        assertEquals("IllegalArgument Exception. The list is empty.", exception.getMessage());
    }


    /**
     * Test null first element.
     * Uses assertThrows.
     */
    @Test
    @DisplayName("Null First Element Test")
    void nullFirstElement() {

        list.add(null);
        list.add(2);

        Exception exception = assertThrows(
                NullPointerException.class,
                () -> Main.findMin(list),
                "NullPointerException expected."
        );
    }


    /**
     * Test null other elements.
     * This error will trigger inside the iteration.
     * Uses assertThrows.
     */
    @Test
    @DisplayName("Null Other Elements Test")
    void nullOthertElements() {

        list.add(2);
        list.add(null);

        Exception exception = assertThrows(
                NullPointerException.class,
                () -> Main.findMin(list),
                "NullPointerException expected."
        );
    }


    /**
     * Test single element list.
     * Uses assertTrue.
     */
    @Test
    @DisplayName("Single Element List Test")
    void singleElementList() {

        list.add(1);

        Object obj = Main.findMin(list);
        assertTrue(obj.equals(1), "The list does not work as expected with single element.");
    }


    /**
     * Test double element list.
     * Uses assertTrue.
     */
    @Test
    void doubleElementList() {

        list.add(3);
        list.add(7);

        Object obj = Main.findMin(list);
        assertTrue(obj.equals(3), "The list does not work as expected with two elements.");
    }

}