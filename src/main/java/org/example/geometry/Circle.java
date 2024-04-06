package org.example.geometry;

public class Circle {

    private double center;
    private double radius;

    public Circle(double center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * 2);
    }

    public double getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
