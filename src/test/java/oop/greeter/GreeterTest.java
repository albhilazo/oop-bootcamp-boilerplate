package oop.greeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {

    Greeter greeter = new Greeter();

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

}
