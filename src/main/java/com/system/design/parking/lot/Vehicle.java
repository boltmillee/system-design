package com.system.design.parking.lot;

import com.system.design.parking.lot.Enum.VehicleType;

public class Vehicle {

    String vehicleNumber;
    VehicleType vehicleType;
    Ticket ticket;

    public Vehicle(String vehicleNumber, VehicleType vehicleType, Ticket ticket) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.ticket = ticket;
    }
}
