package com.mfa;

public class Main {
    public static void main(String[] args) {

        Ticket ticket = new Ticket(101, 1000, 30);
        CancellationService service = new CancellationService();

        double refund = service.calculateRefund(ticket);

        System.out.println("Ticket Cancelled!");
        System.out.println("Refund Amount: ₹" + refund);
    }
}   