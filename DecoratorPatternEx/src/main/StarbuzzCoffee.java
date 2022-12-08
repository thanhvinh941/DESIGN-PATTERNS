package main;

import com.*;

public class StarbuzzCoffee {
    public static void main(String args[]) {
        // cafe, tính đa hình
        Beverage beverage = new Espresso();
        // bonus thêm mocha và sữa
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()
                + "$" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription()
                + "$" + beverage3.cost());
    }
}
