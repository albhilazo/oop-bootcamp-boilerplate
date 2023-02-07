package oop.units;

public abstract class Unit {

    protected double value;
    protected String unitType;

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
}
