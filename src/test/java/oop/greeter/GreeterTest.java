package oop.greeter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {

    Greeter greeter;

    @BeforeEach
    void setUp() {
        greeter = new Greeter(LocalTime.now());
    }

    @Test
    public void itShouldReturnHelloName() {
        String name = "Alice";
        String actual = greeter.greet(name);

        assertEquals("Hello Alice", actual);
    }

    @Test
    public void itShouldTrimTheInput() {
        String name = "   Bob   ";
        String actual = greeter.greet(name);

        assertEquals("Hello Bob", actual);
    }

    @Test
    public void itShouldCapitalizeName() {
        String name = "ted";
        String actual = greeter.greet(name);

        assertEquals("Hello Ted", actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"06:00","12:00"})
    public void itShouldChangeMessageInTheMorning() {
        LocalTime morning = LocalTime.parse("12:00");
//        LocalTime morning = LocalTime.of(12, 00, 00);
        greeter = new Greeter(morning);

        String name = "Bill";
        String actual = greeter.greet(name);

        assertEquals("Good morning Bill", actual);
    }

    @Test
    public void itShouldChangeMessageInTheEvening() {
        LocalTime morning = LocalTime.of(18, 00, 00);
        greeter = new Greeter(morning);

        String name = "Philis";
        String actual = greeter.greet(name);

        assertEquals("Good evening Philis", actual);
    }

    @Test
    public void itShouldChangeMessageInTheNightTime() {
        LocalTime morning = LocalTime.of(23, 0, 1);
        greeter = new Greeter(morning);

        String name = "Marge";
        String actual = greeter.greet(name);

        assertEquals("Good night Marge", actual);
    }

}
