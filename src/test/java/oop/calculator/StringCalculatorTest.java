package oop.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.testng.annotations.DataProvider;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void itShouldReturnZero() {
        Integer actual = StringCalculator.add("");
        assertEquals(0, actual);
    }

    @ParameterizedTest
    @CsvSource({"1,1", "2,2"})
    public void itShouldReturnSingleNumber(String inputs, Integer expected) {
        Integer actual = StringCalculator.add(inputs);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value={"1,2;3", "10,20;30"}, delimiter=';')
    public void itShouldAddTwoNumbers(String inputs, Integer expected) {
        Integer actual = StringCalculator.add(inputs);
        assertEquals(expected, actual);
    }

}
