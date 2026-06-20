package Model;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    String companyName;
    List<Flight> flightList;

    public Airline() {
        this.flightList = new ArrayList<>();
    }

    public Airline(String companyName, List<Flight> flightList) {
        this.companyName = companyName;
        this.flightList = flightList;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }
}
