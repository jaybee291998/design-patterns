package com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.domain;

public abstract class AbstractBeverageDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
