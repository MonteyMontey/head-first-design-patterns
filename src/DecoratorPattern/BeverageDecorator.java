package DecoratorPattern;

import DecoratorPattern.Beverages.Beverage;

public abstract class BeverageDecorator extends Beverage {

    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    protected Beverage beverage;

    public abstract String getDescription();
}

// technically afaik you don't need this class necessarily if you don't want to add or change
// more logic to the condiments in this example, you could also subclass the beverage class.

// it's just an abstract class that sets what all condiments have in common other than the normal beverage
