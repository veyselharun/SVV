import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    // ParameterizedTest <-> Data-Driven Test
    // @ValueSource
    // @EnumSource
    // @MethodSource
    // @CsvSource
    // @CsvFileSource
    //@ArgumentSource


    // Note: @ParameterizedTest needs 'org.junit.jupiter:junit-jupiter-params:5.8.2' artifact.
    // Add this to the implementation section in build.gradle file.

    public int a, b, sum;


    @BeforeEach
    void setUp() {
    }


    @AfterEach
    void tearDown() {
    }


    @ParameterizedTest
    @CsvSource({"3, 5, 8", "1, 4, 5"})
    void dataDrivenAdd(int a, int b, int expectedValue) {
        assertEquals(expectedValue, Calculator.add(a, b),
                "The result of Caculcator.add method is incorrect.");
    }

}