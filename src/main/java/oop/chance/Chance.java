package oop.chance;

public class Chance {

    private double value;

    public Chance(double value) {
        this.value = value;
    }

    public Chance() {
    }

    public double getValue() {
        return value;
    }

    public double forEvent6() {
        return (double) 1/(double) 6;
    }

    public double forEventNot6() {
        return 1 - forEvent6();
    }

    public Chance productWith(Chance ChanceB) {
        return new Chance(value * ChanceB.getValue());
    }

    public Chance logicalOrWith(Chance chanceB) {
        double chanceBValue = chanceB.getValue();
        return new Chance(value + chanceBValue - productWith(chanceB).getValue());
    }

}
