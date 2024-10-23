package com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.domain;

public class MilkDecorator extends AbstractBeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " milk, ";
    }
}
