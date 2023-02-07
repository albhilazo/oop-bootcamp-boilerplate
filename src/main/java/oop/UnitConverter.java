package oop;

public class UnitConverter {

    private final static double FOOT_TO_METER_CONVERSION = 0.3048;
    private final static double INCH_TO_YARD_CONVERSION = 0.0278;

    public static double toMeters(double feet) {
        return feet * FOOT_TO_METER_CONVERSION;
    }

    public static double toFeet(double meters) {
        return meters / FOOT_TO_METER_CONVERSION;
    }

    public static double toYards(double inches) {
        return inches * INCH_TO_YARD_CONVERSION;
    }
}
