package Model;

public class Reservation {
    private Passenger passenger;
    private Flight flight;
    private String seatNumber;
    private String reservationStatus;
    private double paymentAmount;

    public Reservation(Passenger passenger, Flight flight, String seatNumber, String reservationStatus, double paymentAmount) {
        this.passenger = passenger;
        this.flight = flight;
        this.seatNumber = seatNumber;
        this.reservationStatus = reservationStatus;
        this.paymentAmount = paymentAmount;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "passenger=" + passenger +
                ", flight=" + flight +
                ", seatNumber='" + seatNumber + '\'' +
                ", reservationStatus='" + reservationStatus + '\'' +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
