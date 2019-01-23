package FactoryPattern.AbstractFactory.ConcretePizzas;

import FactoryPattern.AbstractFactory.Pizza;
import FactoryPattern.AbstractFactory.PizzaIngredientsFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientsFactory ingredientsFactory;

    public ClamPizza(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }

    public void prepare(){
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        clam = ingredientsFactory.createClam();
    }
}
