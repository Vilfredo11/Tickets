package Tickets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TicketTest {

    @Test
    public void TestSortTickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 950, 93);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 1000, 93);
        Ticket ticket3 = new Ticket(3, "MSK", "SPB", 1000, 93);
        Ticket ticket4 = new Ticket(4, "OMSK", "MSK", 2000, 102);
        Ticket ticket5 = new Ticket(5, "MSK", "SPB", 1500, 93);
        Ticket ticket6 = new Ticket(6, "MSK", "SPB", 900, 93);
        Ticket ticket7 = new Ticket(7, "LA", "NY", 10000, 298);
        Ticket ticket8 = new Ticket(8, "MSK", "SPB", 1000, 99);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket6, ticket1, ticket2, ticket3, ticket8, ticket5};
        Ticket[] actual = manager.findAll("MSK", "SPB");

        Assertions.assertArrayEquals(expected, actual);
    }
}
