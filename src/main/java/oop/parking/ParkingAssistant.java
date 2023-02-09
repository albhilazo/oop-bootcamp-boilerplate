package oop.parking;

import java.util.List;

public class ParkingAssistant {
    private final List<ParkingLot> parkingLots;

    public ParkingAssistant(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingLot park(String car) {
        for (ParkingLot parkingLot : this.parkingLots) {
            if (parkingLot.getCapacityPercentage() < 0.8) {
                parkingLot.park(car);
                return parkingLot;
            }
        }
        return null;
    }

    public void retrieve(String car) {
        ParkingLot parkingLot = this.parkingLots.get(0);
        parkingLot.retrieve(car);
    }
}
