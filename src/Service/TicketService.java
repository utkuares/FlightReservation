package Service;

import Model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketService {
    private List<Ticket> tickets;

    public TicketService() {
        tickets = new ArrayList<>();
    }

    // Create Ticket
    public void createTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    // View Ticket Information
    public Ticket getTicket(String ticketNumber) {
        for (Ticket ticket : tickets) {
            if (ticket.getTicketNumber().equals(ticketNumber)) {
                return ticket;
            }
        }
        return null;
    }

    // View All Tickets
    public List<Ticket> getAllTickets() {
        return tickets;
    }

    // Cancel Ticket
    public boolean cancelTicket(String ticketNumber) {
        Ticket ticket = getTicket(ticketNumber);

        if (ticket != null) {
            tickets.remove(ticket);
            return true;
        }
        return false;
    }

}
