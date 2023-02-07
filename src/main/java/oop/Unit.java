package oop;

public class Unit {

    private final double value;
    private final String unitType;

    public Unit(double value, String unit) {
        this.value = value;
        this.unitType = unit;
    }

    public double getValue() {
        return value;
    }

    public String getUnitType() {
        return unitType;
    }

    public Unit add(Unit unit) {
        return new Unit(this.value + unit.getValue(), this.unitType);
    }
}
