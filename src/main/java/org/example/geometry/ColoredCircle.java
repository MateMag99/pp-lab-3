package org.example.geometry;

public class ColoredCircle extends Circle {
    private String color;

    public ColoredCircle(double center, double radius, String color) {
        super(center, radius);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColoredCircle{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
