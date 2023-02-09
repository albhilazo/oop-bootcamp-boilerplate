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
    @ValueSource(strings = {"06:00:01","12:00:00"})
    public void itShouldChangeMessageInTheMorning(String time) {
        LocalTime morning = LocalTime.parse(time);
        greeter = new Greeter(morning);

        String name = "Bill";
        String actual = greeter.greet(name);

        assertEquals("Good morning Bill", actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"18:00:01","22:00:00"})
    public void itShouldChangeMessageInTheEvening(String time) {
        LocalTime morning = LocalTime.parse(time);
        greeter = new Greeter(morning);

        String name = "Philis";
        String actual = greeter.greet(name);

        assertEquals("Good evening Philis", actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"22:00:01","06:00:00"})
    public void itShouldChangeMessageInTheNightTime(String time) {
        LocalTime morning = LocalTime.parse(time);
        greeter = new Greeter(morning);

        String name = "Marge";
        String actual = greeter.greet(name);

        assertEquals("Good night Marge", actual);
    }

}
