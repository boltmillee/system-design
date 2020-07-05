package com.system.design.parking.lot;

import com.system.design.parking.lot.Enum.VehicleType;

import java.sql.Timestamp;
import java.util.*;

public class ParkingLot {

    Map<String, ParkingSpot> vehicleMapping = new HashMap<String, ParkingSpot>();
    Map<Integer, ParkingFloor> floorMap = new HashMap<Integer, ParkingFloor>();

    private static volatile ParkingLot instance = null;

    private ParkingLot(){

    }

    public static ParkingLot getInstance() {

        if(instance == null){
            synchronized (ParkingLot.class){
                instance = new ParkingLot();
            }
        }
        return instance;
    }

    //assigning ticket to the vehicle
    public void assignTicket(String vehicleNumber, VehicleType vehicleType){

        if(!isParkingFull(vehicleType))
            return ;

        String ticketId = UUID.randomUUID().toString();
        Ticket ticket = new Ticket(ticketId, new Timestamp(System.currentTimeMillis()));
        Vehicle vehicle = new Vehicle(vehicleNumber, vehicleType, ticket);

        assignSpot(vehicle);
    }

    //exit vehicle
    public Integer checkout(String vehicleNumber){
        vehicleMapping.get(vehicleNumber).isOccupied=false;
        vehicleMapping.get(vehicleNumber).vehicle = null;

        return 0;
    }

    private boolean isParkingFull(VehicleType vehicleType){
        return false;
    }

    private void assignSpot(Vehicle vehicle){

        for(Map.Entry<Integer, ParkingFloor> entry : floorMap.entrySet()){
            for(Map.Entry<Integer, ParkingSpot> spotEntry : entry.getValue().spotMap.entrySet()){
                ParkingSpot spot = spotEntry.getValue();

                if(!spot.isOccupied){
                    spot.vehicle = vehicle;
                    spot.isOccupied = true;
                    vehicleMapping.put(vehicle.vehicleNumber, spot);
                    return;
                }
            }
        }
    }
}
