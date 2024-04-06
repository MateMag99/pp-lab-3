package org.example;

import org.example.geometry.Circle;
import org.example.geometry.ColoredCircle;
import org.example.geometry.Point;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(5,10);
        System.out.println(point);

        Circle circle = new Circle(5, 10);
        System.out.println(circle);

        ColoredCircle coloredCircle = new ColoredCircle(2,4, "RED");
        System.out.println(coloredCircle);
    }
}