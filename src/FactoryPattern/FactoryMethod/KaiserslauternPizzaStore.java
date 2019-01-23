package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.ConcretePizzas.KaiserslauternStyleCheesePizza;
import FactoryPattern.FactoryMethod.ConcretePizzas.KaiserslauternStyleClamPizza;
import FactoryPattern.FactoryMethod.ConcretePizzas.KaiserslauternStylePepperoniPizza;
import FactoryPattern.FactoryMethod.ConcretePizzas.KaiserslauternStyleVeggiePizza;
import FactoryPattern.SimpleFactory.Pizza;

public class KaiserslauternPizzaStore extends PizzaStore {

    public Pizza createPizza(String item){
        switch (item){
            case "cheese":
                return new KaiserslauternStyleCheesePizza();
            case "veggie":
                return new KaiserslauternStyleVeggiePizza();
            case "clam":
                return new KaiserslauternStyleClamPizza();
            case "pepperoni":
                return new KaiserslauternStylePepperoniPizza();
            default:
                return null;
        }
    }
}