package org.example.geometry;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double calculatePerimeter() {
        return 2 * width + 2 * length;
    }

    public double calculateArea() {
        return width * length;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
