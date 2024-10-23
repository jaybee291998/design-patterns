package com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.domain;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 17;
    }
}
