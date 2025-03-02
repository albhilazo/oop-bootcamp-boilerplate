package oop.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitConverterTest {

    private final double DELTA_TOLERANCE = 0.01d;

    @Test
    public void itShouldConvertFeetToMeters() {
        double actualMeters = UnitConverter.toMeters(5);
        assertEquals(1.52, actualMeters, DELTA_TOLERANCE);
    }

    @Test
    public void itShouldConvertMetersToFeet() {
        double actualFeet = UnitConverter.toFeet(1);
        assertEquals(3.28, actualFeet, DELTA_TOLERANCE);
    }

    @Test
    public void itShouldConvertInchesToYards() {
        double actualYards = UnitConverter.toYards(5);
        assertEquals(0.1389, actualYards, DELTA_TOLERANCE);
    }

    @Test
    public void itShouldConvertMetersToCentimeters() {
        double actualCentimeters = UnitConverter.toCentimeters(2);
        assertEquals(200, actualCentimeters, DELTA_TOLERANCE);
    }

    @Test
    public void itShouldConvertGallonsToLiters() {
        double actualLiters = UnitConverter.toLiters(4);
        assertEquals(15.1416, actualLiters, DELTA_TOLERANCE);
    }

    @Test
    public void itShouldAddInches() {
        DistanceUnit unit = new DistanceUnit(2, "inches");
        DistanceUnit actualInches = unit.add(new DistanceUnit(2, "inches"));
        assertEquals(4, actualInches.getValue());
    }

    @Test
    public void itShouldAddDifferentUnits() {
        DistanceUnit unit = new DistanceUnit(2, "inches");
        DistanceUnit actualInches = unit.add(new DistanceUnit(1, "meters"));
        assertEquals(41.37008, actualInches.getValue());
        assertEquals("inches", actualInches.getUnitType());
    }
}
