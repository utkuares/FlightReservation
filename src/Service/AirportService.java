package Service;

import Model.Airport;

import java.util.ArrayList;
import java.util.List;

public class AirportService {

    private List<Airport> airports;

    public AirportService() {
        airports = new ArrayList<>();
    }

    // Create
    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    // Read All
    public List<Airport> getAllAirport() {
        return airports;
    }

    // Read One
    public Airport getAirportByName(String airportName) {
        for (Airport airport : airports) {
            if (airport.getAirportName().equals(airportName)) {
                return airport;
            }
        }
        return null;
    }

    // Update
    public boolean updateAirport(String airportName,Airport updatedAirport) {
        for (int i = 0; i < airports.size(); i++) {
            if (airports.get(i).getAirportName().equals(airportName)) {
                airports.set(i,updatedAirport);
                return true;
            }
        }
        return false;
    }

    // Delete
    public boolean removeAirport(String airportName) {
        return airports.removeIf(
                airport -> airport.getAirportName().equalsIgnoreCase(airportName)
        );
    }

    /*public boolean removeAirport(String airportName) {
        for (int i = 0; i < airports.size(); i++) {
            if (airports.get(i).getAirportName().equalsIgnoreCase(airportName)) {
                airports.remove(i);
                return true;
            }
        }
        return false;
    }*/

}
