package oop.parking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ParkingLot {

    private final int capacity;
    private List<String> carsParked = new ArrayList<>();

    public ParkingLot() {
        this.capacity = 10;
    }

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public Collection<String> getCarsParked() {
        return carsParked;
    }

    public double getCapacityPercentage() {
        return (double) carsParked.size() / capacity;
    }

    public void park(String car) {
        carsParked.add(car);
    }

    public void retrieve(String car) {
        carsParked.remove(car);
    }
}
