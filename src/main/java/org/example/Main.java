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

        Circle[] tab = new Circle[5];
        tab[0] = new Circle(1,3);
        tab[1] = new ColoredCircle(2,5, "BLUE");
        tab[2] = new Circle(1,7);
        tab[3] = new ColoredCircle(5,12, "RED");
        tab[4] = new Circle(3,9);

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] instanceof ColoredCircle) {
                System.out.println(tab[i].calculateArea() + " " + ((ColoredCircle) tab[i]).getColor());
            } else {
                System.out.println(tab[i].calculateArea());
            }
        }
    }
}