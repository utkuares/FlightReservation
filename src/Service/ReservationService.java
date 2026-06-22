package Service;

import Model.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    private List<Reservation> reservations;

    public ReservationService() {
        reservations = new ArrayList<>();
    }

    // Create
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    // Read All
    public List<Reservation> getAllReservations() {
        return reservations;
    }

    // Read One
    public Reservation getReservationBySeatNumber(String seatNumber) {
        for (Reservation reservation : reservations) {
            if (reservation.getSeatNumber().equals(seatNumber)) {
                return reservation;
            }
        }
        return null;
    }

    // Update
    public void updateReservation(String seatNumber,
                                  Reservation updatedReservation) {

        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getSeatNumber().equals(seatNumber)) {
                reservations.set(i, updatedReservation);
                break;
            }
        }
    }

    // Delete
    public void removeReservation(String seatNumber) {

        for (int i = 0; i < reservations.size(); i++) {
            if (reservations.get(i).getSeatNumber().equals(seatNumber)) {
                reservations.remove(i);
                break;
            }
        }
    }
}