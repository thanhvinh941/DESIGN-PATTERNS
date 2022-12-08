package com;

public class Mocha extends CondimentDecorator {

    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha"; // Espresso
    }
    public double cost() {
        return .20 + beverage.cost(); // + thêm 1.99
    }
}
