package com.teachmeskills.lesson6.task1;

public class Circle implements Figures {

    private static final String NAME = "Circle";
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String getName() {
        return NAME;
    }
    public double getRadius() {
        return radius;
    }
}
