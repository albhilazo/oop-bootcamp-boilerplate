package oop.units;

public class UnitConverter {

    private static final double FOOT_TO_METER_CONVERSION = 0.3048;
    private static final double INCH_TO_YARD_CONVERSION = 0.0278;
    private static final double METER_TO_CENTIMETER_CONVERSION = 100;
    private static final double GALLON_TO_LITERS_CONVERSION = 3.7854;

    public static double toMeters(double feet) {
        return feet * FOOT_TO_METER_CONVERSION;
    }

    public static double toFeet(double meters) {
        return meters / FOOT_TO_METER_CONVERSION;
    }

    public static double toYards(double inches) {
        return inches * INCH_TO_YARD_CONVERSION;
    }

    public static double toCentimeters(double meters) {
        return meters * METER_TO_CENTIMETER_CONVERSION;
    }

    public static double toLiters(double gallons) {
        return gallons * GALLON_TO_LITERS_CONVERSION;
    }
}
