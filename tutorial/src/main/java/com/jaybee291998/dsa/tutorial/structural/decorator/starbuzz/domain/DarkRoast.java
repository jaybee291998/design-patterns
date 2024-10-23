package com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.domain;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 10;
    }
}
