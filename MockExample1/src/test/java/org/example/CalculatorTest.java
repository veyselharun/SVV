package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatorTest {

    /*
    @Test
    void add() {
        Calculator calculator = new Calculator(new CalculatorService());
        assertEquals(20, calculator.add(7, 13));
    }
     */

    // Test with Mockito
    @Test
    void addWithMock() {
        // Create a mock instance of MathOperations
        MathOperations mathOperationsMock = mock(MathOperations.class);

        // Define the behavior of the mock
        when(mathOperationsMock.add(7, 13)).thenReturn(20); // Mock add operation

        // Create an instance of Calculator and inject the mock MathOperation
        Calculator calculator = new Calculator(mathOperationsMock);

        // Call the method we want to test
        int result = calculator.add(7, 13);

        // Verify that the method of the mock was called with specific arguments
        verify(mathOperationsMock).add(7, 13);

        // Verify the result
        assertEquals(20, result);
    }
}