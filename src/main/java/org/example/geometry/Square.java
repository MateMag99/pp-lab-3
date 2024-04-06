package org.example.geometry;

public class Square extends Rectangle {
    private double side;

    public Square(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} ";
    }
}
