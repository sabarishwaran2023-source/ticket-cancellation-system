package com.mfa;

public class CancellationService {

    public double calculateRefund(Ticket ticket) {
        int hours = ticket.getHoursBeforeTravel();
        double price = ticket.getPrice();

        if (hours > 48) {
            return price * 0.9;
        } else if (hours >= 24) {
            return price * 0.5;
        } else {
            return 0;
        }
    }
}