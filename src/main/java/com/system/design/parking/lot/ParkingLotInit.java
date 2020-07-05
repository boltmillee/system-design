package com.system.design.parking.lot;

import com.system.design.parking.lot.Enum.VehicleType;

public class ParkingLotInit {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        ParkingSpot spot1 = new ParkingSpot();

        ParkingSpot spot2 = new ParkingSpot();

        ParkingFloor floor = new ParkingFloor();
        floor.spotMap.put(1, spot1);
        floor.spotMap.put(2, spot2);

        parkingLot.floorMap.put(1, floor);

        parkingLot.assignTicket("123", VehicleType.BIKE);
        parkingLot.checkout("123");
    }
}
