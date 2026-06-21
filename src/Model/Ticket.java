package Model;

public class Ticket {

    private String ticketNumber;
    private double fare;
    private Reservation reservation;

    public Ticket(String ticketNumber, double fare, Reservation reservation) {
        this.ticketNumber = ticketNumber;
        this.fare = fare;
        this.reservation = reservation;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
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
                ", fare=" + fare +
                ", reservation=" + reservation +
                '}';
    }
}