package Service;

import Model.Airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineService {

    private List<Airline> airlines;

    public AirlineService() {
        airlines = new ArrayList<>();
    }

    // Create
    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    // Read All
    public List<Airline> getAllAirlines() {
        return airlines;
    }

    // Read One
    public Airline getAirlineByName(String companyName) {
        for (Airline airline : airlines) {
            if (airline.getCompanyName().equals(companyName)) {
                return airline;
            }
        }
        return null;
    }

    // Update
    public void updateAirline(String companyName,
                              Airline updatedAirline) {

        for (int i = 0; i < airlines.size(); i++) {
            if (airlines.get(i).getCompanyName().equals(companyName)) {
                airlines.set(i, updatedAirline);
                break;
            }
        }
    }

    // Delete
    public void removeAirline(String companyName) {

        for (int i = 0; i < airlines.size(); i++) {
            if (airlines.get(i).getCompanyName().equals(companyName)) {
                airlines.remove(i);
                break;
            }
        }
    }
}