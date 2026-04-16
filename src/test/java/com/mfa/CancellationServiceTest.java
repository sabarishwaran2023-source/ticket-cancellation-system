package com.mfa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CancellationServiceTest {

    CancellationService service = new CancellationService();

    @Test
    public void testFullRefund() {
        Ticket t = new Ticket(1, 1000, 60);
        assertEquals(900, service.calculateRefund(t));
    }

    @Test
    public void testHalfRefund() {
        Ticket t = new Ticket(2, 1000, 30);
        assertEquals(500, service.calculateRefund(t));
    }

    @Test
    public void testNoRefund() {
        Ticket t = new Ticket(3, 1000, 10);
        assertEquals(0, service.calculateRefund(t));
    }
}

