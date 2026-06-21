package Model;

public class Airport {

    private String airportName;
    private String city;
    private String country;
    private int aircraftCapacity;

    public Airport(String airportName, String city, String country, int aircraftCapacity) {
        this.airportName = airportName;
        this.city = city;
        this.country = country;
        this.aircraftCapacity = aircraftCapacity;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getAircraftCapacity() {
        return aircraftCapacity;
    }

    public void setAircraftCapacity(int aircraftCapacity) {
        this.aircraftCapacity = aircraftCapacity;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportName='" + airportName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", aircraftCapacity=" + aircraftCapacity +
                '}';
    }
}