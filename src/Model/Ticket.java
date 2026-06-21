package Model;

public class Ticket {
    private String ticketNumber;
    private Reservation reservation;
    private SeatType seatType;

    public Ticket(String ticketNumber, double fare, Reservation reservation) {
        this.ticketNumber = ticketNumber;
        this.reservation = reservation;
        this.seatType = seatType;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getFare() {
        return seatType.getPrice();
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", seatType=" + seatType +
                ", fare=" + getFare() +
                '}';
    }
}