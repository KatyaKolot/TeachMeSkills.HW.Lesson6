package com.teachmeskills.lesson6.task2;

public class Director implements IPosition{

    private final String NAME = "Director";

    @Override
    public String posName() {
        return NAME;
    }
}
