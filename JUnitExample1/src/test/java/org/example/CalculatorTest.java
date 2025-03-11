package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Calculator Add Method Test")
    void add() {
        assertEquals(10, Calculator.add(3, 7),
                "The result of Caculcator.add method is incorrect.");
    }

}