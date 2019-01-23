package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.ConcretePizzas.Ingredients.*;

public interface PizzaIngredientsFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}


// abstract factory
// gives an interface for creating a family of products without specifying their concrete classes