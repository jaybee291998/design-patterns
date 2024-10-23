package com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.domain;

public class MochaDecorator extends AbstractBeverageDecorator {

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 4;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " mocha, ";
    }
}
