import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTest {


    // Test fixture
    private List<String> list;


    // Pre-test setup method (prefix)
    @BeforeEach
    void setUp() {
        list = new ArrayList<String>();
    }


    // Post test teardown method (postfix)
    @AfterEach
    void tearDown() { list = null; }


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
                () -> Minimum.findMin(list),
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
                () -> Minimum.findMin(list),
                "IllegalPointer expected" // Message is optional.
        );

        // Optional. To check whether the error messages match.
        assertEquals("IllegalArgument Exception. The list is empty.", exception.getMessage());
    }


    /**
     * Test null first element.
     * Uses assertThrows and assertEquals.
     */
    @Test
    @DisplayName("Null First Element Test")
    void nullFirstElement() {

        // Other elements may also be Null. They should also be checked.
        list.add(null);
        list.add("cat");

        Exception exception = assertThrows(
                NullPointerException.class,
                () -> Minimum.findMin(list));

        assertEquals("NullPointer Exception. The first element is null.", exception.getMessage());
    }


    /**
     * Test null second element.
     * Uses assertThrows.
     */
    @Test
    @DisplayName("Null Second Element Test")
    void nullSecondElement() {

        // Other elements may also be Null. They should also be checked.
        list.add("cat");
        list.add(null);

        Exception exception = assertThrows(
                NullPointerException.class,
                () -> Minimum.findMin(list),
                "NullPointerException expected."
        );

    }


    /**
     * Test single null element list.
     * Uses assertThrows and assertEquals.
     */
    @Test
    @DisplayName("Single Null Element List Test")
    void singleNullElement() {

        list.add(null);

        Exception exception = assertThrows(
                NullPointerException.class,
                () -> Minimum.findMin(list)
        );

        assertEquals("NullPointer Exception. The first element is null.", exception.getMessage());
    }

    /**
     * Test incomparable elements.
     * Uses assertThrows.
     */
    @Test
    @DisplayName("Incomparable Elements Test")
    void mutuallyIncomparable() {

        List list = new ArrayList();

        list.add("cat");
        list.add("dog");
        list.add(1);

        Exception exception = assertThrows(
                ClassCastException.class,
                () -> Minimum.findMin(list),
                "ClassCastException expected."
        );
    }


    /**
     * Test single element list.
     * Uses assertTrue.
     */
    @Test
    @DisplayName("Single Element List Test")
    void singleElementList() {

        list.add("cat");

        Object obj = Minimum.findMin(list);
        assertTrue(obj.equals("cat"), "The list must contain single element but does not.");

    }


    /**
     * Test double element list.
     * Uses assertTrue.
     */
    @Test
    void doubleElementList() {

        list.add("dog");
        list.add("cat");

        Object obj = Minimum.findMin(list);
        assertTrue(obj.equals("cat"), "The list must contain two elements but does not.");

    }


}