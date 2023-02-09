package oop.parking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {

    @Test
    public void itShouldParkACar() {
        ParkingLot parkingLot = new ParkingLot();
        String car = "CAR1";

        assertTrue(parkingLot.getCarsParked().isEmpty());
        parkingLot.park(car);
        assertFalse(parkingLot.getCarsParked().isEmpty());
    }

    @Test
    public void itShouldRetrieveAParkedCar() {
        ParkingLot parkingLot = new ParkingLot();
        String car = "CAR1";
        parkingLot.park(car);

        assertFalse(parkingLot.getCarsParked().isEmpty());
        parkingLot.retrieve(car);
        assertTrue(parkingLot.getCarsParked().isEmpty());
    }

    @Test
    public void itShouldBeParkedByAnAssistant() {
        ParkingLot parkingLot = new ParkingLot();
        ParkingAssistant parkingAssistant = new ParkingAssistant(List.of(parkingLot));
        String car = "CAR1";

        assertTrue(parkingLot.getCarsParked().isEmpty());
        parkingAssistant.park(car);
        assertFalse(parkingLot.getCarsParked().isEmpty());
    }

    @Test
    public void itShouldBeRetrievedByAnAssistant() {
        ParkingLot parkingLot = new ParkingLot();
        ParkingAssistant parkingAssistant = new ParkingAssistant(List.of(parkingLot));
        String car = "CAR1";
        parkingLot.park(car);

        assertFalse(parkingLot.getCarsParked().isEmpty());
        parkingAssistant.retrieve(car);
        assertTrue(parkingLot.getCarsParked().isEmpty());
    }

    @Test
    public void itShouldHandleMultipleParkingLotsByAnAssistant() {
        ParkingLot parkingLot = new ParkingLot();
        ParkingLot parkingLot2 = new ParkingLot();
        ParkingAssistant parkingAssistant = new ParkingAssistant(List.of(parkingLot, parkingLot2));

        ParkingLot actualParkingLotWithCar = parkingAssistant.park("CAR1");
        assertEquals(parkingLot, actualParkingLotWithCar);
    }

    @Test
    public void itShouldParkOnlyIfLessThan80PercentFull() {
        ParkingLot parkingLot = new ParkingLot(2);
        ParkingLot parkingLot2 = new ParkingLot(2);
        ParkingAssistant parkingAssistant = new ParkingAssistant(List.of(parkingLot, parkingLot2));
        parkingLot.park("CAR1");
        parkingLot.park("CAR2");
        parkingLot2.park("CAR3");

        ParkingLot actualParkingLotWithCar = parkingAssistant.park("CAR4");
        assertEquals(parkingLot2, actualParkingLotWithCar);
    }

}
