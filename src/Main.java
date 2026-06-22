import Model.*;
import Service.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // User Test
        UserService userService = new UserService();

        User user = new User(
                "utku",
                "12345",
                "Utku",
                "Taskin",
                "utku@gmail.com",
                UserType.CUSTOMER
        );

        userService.addUser(user);
        System.out.println("Users: " + userService.getAllUsers().size());

        // Airport Test
        AirportService airportService = new AirportService();

        Airport airport = new Airport(
                "Adnan Menderes",
                "Izmir",
                "Turkey",
                100
        );

        airportService.addAirport(airport);
        System.out.println("Airport: "
                + airportService.getAirportByName("Adnan Menderes"));

        // Flight Test
        FlightService flightService = new FlightService();

        Flight flight = new Flight();
        flight.setFlightNumber("TK100");
        flight.setDepartureAirport("Izmir");
        flight.setArrivalAirport("Istanbul");
        flight.setDepartureDateTime(LocalDateTime.now());
        flight.setTotalSeats(180);
        flight.setAvailableSeats(180);
        flight.setTicketPrice(2500);

        flightService.addFlight(flight);

        System.out.println("Flight: "
                + flightService.findFlightByNumber("TK100"));

        // Passenger Test
        PassengerService passengerService = new PassengerService();

        Passenger passenger = new Passenger(
                "Ali Veli",
                25,
                "Male",
                "R001",
                "12A",
                "TK100",
                "P123456"
        );

        passengerService.addPassenger(passenger);

        System.out.println("Passenger: "
                + passengerService.getPassengerByPassportNumber("P123456")
                .getPassengerName());

        // Reservation Test
        ReservationService reservationService =
                new ReservationService();

        Reservation reservation = new Reservation(
                passenger,
                flight,
                "12A",
                "CONFIRMED",
                2500
        );

        reservationService.addReservation(reservation);

        System.out.println("Reservation Seat: "
                + reservationService
                .getReservationBySeatNumber("12A")
                .getSeatNumber());

        // Ticket Test
        TicketService ticketService = new TicketService();

        Ticket ticket = new Ticket(
                "T001",
                2500,
                reservation
        );

        ticketService.createTicket(ticket);

        System.out.println("Ticket: "
                + ticketService.getTicket("T001")
                .getTicketNumber());

        // Airline Test
        AirlineService airlineService = new AirlineService();

        Airline airline = new Airline(
                "Turkish Airlines",
                new ArrayList<>()
        );

        airline.getFlightList().add(flight);

        airlineService.addAirline(airline);

        System.out.println("Airline: "
                + airlineService.getAirlineByName("Turkish Airlines")
                .getCompanyName());

        // Promotion Test
        Promotion promotion = new Promotion();

        double totalPrice =
                promotion.calculateTotalPrice(
                        SeatType.ECONOMY,
                        2
                );

        System.out.println("Discounted Price: "
                + totalPrice);
    }
}