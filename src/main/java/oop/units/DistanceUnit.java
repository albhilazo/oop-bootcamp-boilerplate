package oop.units;

public class DistanceUnit extends Unit {

    public DistanceUnit(double value, String unit) {
        super(value, unit);
    }

    public DistanceUnit add(DistanceUnit distanceUnit) {
        return new DistanceUnit(this.value + distanceUnit.getValue(), this.unitType);
    }
}
