package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.ConcretePizzas.BerlinStyleCheesePizza;
import FactoryPattern.FactoryMethod.ConcretePizzas.BerlinStyleClamPizza;
import FactoryPattern.FactoryMethod.ConcretePizzas.BerlinStylePepperoniPizza;
import FactoryPattern.FactoryMethod.ConcretePizzas.BerlinStyleVeggiePizza;
import FactoryPattern.SimpleFactory.Pizza;

public class BerlinPizzaStore extends PizzaStore {

    public Pizza createPizza(String item){
        switch (item){
            case "cheese":
                return new BerlinStyleCheesePizza();
            case "veggie":
                return new BerlinStyleVeggiePizza();
            case "clam":
                return new BerlinStyleClamPizza();
            case "pepperoni":
                return new BerlinStylePepperoniPizza();
            default:
                return null;
        }
    }
}
