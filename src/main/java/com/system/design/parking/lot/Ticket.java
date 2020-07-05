package com.system.design.parking.lot;

import java.sql.Timestamp;

public class Ticket {

    String ticketId;
    Timestamp inTime;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Timestamp getInTime() {
        return inTime;
    }

    public void setInTime(Timestamp inTime) {
        this.inTime = inTime;
    }

    public Ticket(String ticketId, Timestamp inTime) {
        this.ticketId = ticketId;
        this.inTime = inTime;
    }
}
