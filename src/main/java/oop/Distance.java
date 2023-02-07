package oop;

public class Distance {

    private final static double FOOT_TO_METER_CONVERSION = 0.3048;

    public static double toMeters(double feet) {
        return feet * FOOT_TO_METER_CONVERSION;
    }

    public static double toFeet(double meters) {
        return meters / FOOT_TO_METER_CONVERSION;
    }

}
