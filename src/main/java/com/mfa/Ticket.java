package com.mfa;

public class Ticket {
    private int ticketId;
    private double price;
    private int hoursBeforeTravel;

    public Ticket(int ticketId, double price, int hoursBeforeTravel) {
        this.ticketId = ticketId;
        this.price = price;
        this.hoursBeforeTravel = hoursBeforeTravel;
    }

    public double getPrice() {
        return price;
    }

    public int getHoursBeforeTravel() {
        return hoursBeforeTravel;
    }
}