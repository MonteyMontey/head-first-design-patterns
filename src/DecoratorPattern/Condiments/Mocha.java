package DecoratorPattern.Condiments;

import DecoratorPattern.Beverages.Beverage;
import DecoratorPattern.BeverageDecorator;

public class Mocha extends BeverageDecorator {

    public Mocha(Beverage decoratedBeverage){
        super(decoratedBeverage);
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return beverage.cost() + .20;
    }
}
