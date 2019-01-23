package FactoryPattern.AbstractFactory.ConcretePizzas;

import FactoryPattern.AbstractFactory.Pizza;
import FactoryPattern.AbstractFactory.PizzaIngredientsFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }

    public void prepare(){
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
    }
}
