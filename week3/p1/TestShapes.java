package p1;

import p1.shapes.Circle;
import p1.shapes.Square;

public class TestShapes {
    public static void main(String[] args) {

        System.out.println("1. Test Square class:");
        Square square1 = new Square();
        System.out.println("Default square - side: " + square1.getSide());

        Square square2 = new Square(5.0);
        System.out.println("Square with side 5: " + square2.getSide());

        square1.setSide(3.0);
        System.out.println("Square after setting side = 3: " + square1.getSide());

        System.out.println();

        System.out.println("2. Test Circle class:");
        Circle circle1 = new Circle();
        System.out.println("Default circle - radius: " + circle1.getRadius());

        Circle circle2 = new Circle(4.0);
        System.out.println("Circle with radius 4: " + circle2.getRadius());

        circle1.setRadius(2.5);
        System.out.println("Circle after setting radius = 2.5: " + circle1.getRadius());
    }
}