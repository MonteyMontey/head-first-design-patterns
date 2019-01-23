package FactoryPattern.FactoryMethod;

import FactoryPattern.SimpleFactory.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);  // pizza store doesn't need to deal at all with the concrete pizzas subclasses

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // factory method
    // separates client code in the superclass from the object creation in the subclass
    public abstract Pizza createPizza(String type);
}
