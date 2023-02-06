package oop;

public class Chance {

    public double forEvent6() {
        return (double) 1/(double) 6;
    }

    public double forEventNot6() {
        return 1 - forEvent6();
    }
}
