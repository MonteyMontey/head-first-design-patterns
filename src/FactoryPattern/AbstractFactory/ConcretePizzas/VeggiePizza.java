package FactoryPattern.AbstractFactory.ConcretePizzas;

import FactoryPattern.AbstractFactory.Pizza;
import FactoryPattern.AbstractFactory.PizzaIngredientsFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public VeggiePizza(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }

    public void prepare(){
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        veggies = ingredientsFactory.createVeggies();
    }
}
