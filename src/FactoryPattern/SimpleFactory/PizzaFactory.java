package FactoryPattern.SimpleFactory;

import FactoryPattern.SimpleFactory.ConcretePizzas.CheesePizza;
import FactoryPattern.SimpleFactory.ConcretePizzas.ClamPizza;
import FactoryPattern.SimpleFactory.ConcretePizzas.PepperoniPizza;
import FactoryPattern.SimpleFactory.ConcretePizzas.VeggiePizza;

class PizzaFactory {

    Pizza createPizza(String type){
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }

        return pizza;
    }
}