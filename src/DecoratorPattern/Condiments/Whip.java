package DecoratorPattern.Condiments;

import DecoratorPattern.Beverages.Beverage;
import DecoratorPattern.BeverageDecorator;

public class Whip extends BeverageDecorator {

    public Whip(Beverage decoratedBeverage){
        super(decoratedBeverage);
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    public double cost(){
        return beverage.cost() + .30;
    }
}
