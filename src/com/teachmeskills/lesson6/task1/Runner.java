package com.teachmeskills.lesson6.task1;

public class Runner {

    public static void main(String[] args) {
        Figures[] figure = {new Rectangle(6, 9),
                new Triangle(6, 9, 5),
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(5, 3, 6)};
        for (Figures fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea() );

    }
}