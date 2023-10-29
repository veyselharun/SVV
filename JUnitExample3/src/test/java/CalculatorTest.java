import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    /**
     * Parameterized Test <-> Data-Driven Test
     * Parameterized test annotations:
     * - @ValueSource
     * - @EnumSource
     * - @MethodSource
     * - @CsvSource
     * - @CsvFileSource
     * - @ArgumentSource
     *
     * Parameterized test needs 'org.junit.jupiter:junit-jupiter-params:5.8.2' artifact.
     * Need to add the package in the build.gradle file.
     *
     * @param a
     * @param b
     * @param expectedValue
     */
    @ParameterizedTest
    @CsvSource({"3, 5, 8", "1, 4, 5"})
    void dataDrivenAdd(int a, int b, int expectedValue) {
        Calculator calculator = new Calculator();
        assertEquals(expectedValue, calculator.add(a, b),
                "The result of Calculator.add method is incorrect.");

        //assertEquals(expectedValue, Calculator.add(a, b),
        //        "The result of Calculator.add method is incorrect.");

    }

}