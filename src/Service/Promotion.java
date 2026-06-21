package Service;

import Model.SeatType;

public class Promotion {

    public double calculateTotalPrice(SeatType seatType,int ticketCount) {

        double ticketPrice = seatType.getPrice();

        if (ticketCount > 1) {
            ticketPrice *= 0.8;
        }
        return ticketPrice * ticketCount;
    }

}
