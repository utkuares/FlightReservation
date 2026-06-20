package Service;

import Model.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerService {

    private List<Passenger> passengers;

    public PassengerService()
    {
        passengers = new ArrayList<>();
    }

    // Create
    public void addPassenger(Passenger passenger)
    {
        passengers.add(passenger);
    }

    // Read All
    public List<Passenger> getAllPassengers() {
        return passengers;
    }

    // Read One
    public Passenger getPassengerByPassportNumber(String passportNumber) {
        for (Passenger passenger : passengers) {
            if (passenger.getPassportNumber().equals(passportNumber)) {
                return passenger;
            }
        }
        return null;
    }

    // Update
    public void updatePassenger(String passportNumber,Passenger updatedPassenger) {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getPassportNumber().equals(passportNumber)) {
                passengers.set(i,updatedPassenger);
                break;
            }
        }
    }

    // Delete
    public void removePassenger(String passportNumber) {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getPassportNumber().equals(passportNumber)) {
                passengers.remove(i);
                break;
            }
        }
    }

}
