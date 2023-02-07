package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceTest {

    private final double DELTA_TOLERANCE = 0.01d;

    @Test
    public void itShouldConvertFeetToMeters() {
        double actualMeters = Distance.toMeters(5);
        assertEquals(1.52, actualMeters, DELTA_TOLERANCE);
    }

    @Test
    public void itShouldConvertMetersToFeet() {
        double actualFeet = Distance.toFeet(1);
        assertEquals(3.28, actualFeet, DELTA_TOLERANCE);
    }

}
