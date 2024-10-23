package com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.domain;

public abstract class Beverage {
    protected String description = "";
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
