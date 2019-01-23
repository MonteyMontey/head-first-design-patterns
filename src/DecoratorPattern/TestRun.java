package DecoratorPattern;

import DecoratorPattern.Beverages.Beverage;
import DecoratorPattern.Beverages.Espresso;
import DecoratorPattern.Beverages.HouseBlend;
import DecoratorPattern.Condiments.Mocha;
import DecoratorPattern.Condiments.Whip;

public class TestRun {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+ beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+ beverage2.cost());
    }
}

// Decorator Pattern adds functionality to an object at runtime, instead at compile time when subclassing
// advantage: you don't need to have a billion subclasses of all combinations but can combine as you wish at runtime
