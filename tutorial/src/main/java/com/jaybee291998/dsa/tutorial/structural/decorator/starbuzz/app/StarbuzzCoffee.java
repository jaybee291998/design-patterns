package com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.app;

import com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.domain.Beverage;
import com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.domain.DarkRoast;
import com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.domain.MilkDecorator;
import com.jaybee291998.dsa.tutorial.structural.decorator.starbuzz.domain.MochaDecorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new MochaDecorator(beverage);
        beverage = new MilkDecorator(beverage);

        System.out.println(beverage.getDescription());
        System.out.println("cost: " + beverage.cost());
    }
}

