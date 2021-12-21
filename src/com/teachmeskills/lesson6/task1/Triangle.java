package com.teachmeskills.lesson6.task1;

public class Triangle implements Figures {

    private static final String NAME = "Triangle";
    double A;
    double B;
    double C;

    public Triangle(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    @Override
    public double getArea() {
        double p = (A + B + C) / 2;
        double area = Math.sqrt(p * (p - A) * (p - B) * (p - C));
        return area;
    }

    @Override
    public String getName() {
        return NAME;
    }
    public double geSideA() {
        return A;
    }

    public double getSideB() {
        return B;
    }

    public double getSideC() {
        return C;
    }
}
