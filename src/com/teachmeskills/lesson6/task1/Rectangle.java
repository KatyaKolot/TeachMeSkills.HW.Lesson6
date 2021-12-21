package com.teachmeskills.lesson6.task1;

public class Rectangle implements Figures {

    private static final String NAME = "Rectangle";
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return NAME;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
