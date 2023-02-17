package oop.seconds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondsTest {

    @Test
    public void itShouldReturnSeconds() {
        String actual = Seconds.format(5);
        assertEquals("00:00:05", actual);
    }

    @Test
    public void itShouldReturnMinutes() {
        String actual = Seconds.format(61);
        assertEquals("00:01:01", actual);
    }

    @Test
    public void itShouldReturnHours() {
        String actual = Seconds.format(86399);
        assertEquals("23:59:59", actual);
    }

}