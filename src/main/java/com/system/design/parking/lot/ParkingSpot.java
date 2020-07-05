package com.system.design.parking.lot;

import com.system.design.parking.lot.Enum.ParkingSpotType;

public class ParkingSpot {
    ParkingSpotType parkingSpotType;
    Vehicle vehicle;
    boolean isOccupied = false;
}
