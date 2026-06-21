package Service;


import Model.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightService {

    private List<Flight> flights;

    public FlightService() {
        flights = new ArrayList<>();
    }

    // Create
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    // Read All
    public List<Flight> getAllFlights() {
        return flights;
    }

    // Read One
    public Flight getFLight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

    // Update
    public void updateFlight(int index,Flight flight) {
        if (index >= 0 && index <= flights.size()) {
            flights.set(index,flight);
        }
    }

    // Search
    public Flight findFlightByNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

}
