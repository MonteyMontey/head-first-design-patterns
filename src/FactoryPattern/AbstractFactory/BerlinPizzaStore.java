package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.ConcretePizzas.CheesePizza;
import FactoryPattern.AbstractFactory.ConcretePizzas.ClamPizza;
import FactoryPattern.AbstractFactory.ConcretePizzas.PepperoniPizza;
import FactoryPattern.AbstractFactory.ConcretePizzas.VeggiePizza;

public class BerlinPizzaStore extends PizzaStore {

    public Pizza createPizza(String item){
        PizzaIngredientsFactory ingredientsFactory = new BerlinPizzaIngredientsFactory();

        switch (item){
            case "cheese":
                return new CheesePizza(ingredientsFactory);
            case "veggie":
                return new VeggiePizza(ingredientsFactory);
            case "clam":
                return new ClamPizza(ingredientsFactory);
            case "pepperoni":
                return new PepperoniPizza(ingredientsFactory);
            default:
                return null;
        }
    }
}
