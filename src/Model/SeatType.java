package Model;

import java.util.PrimitiveIterator;

public enum SeatType {
    ECONOMY(1000),
    BUSINESS(2500),
    FIRST_CLASS(5000);

    private final double price;

    SeatType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
