package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.ConcretePizzas.Ingredients.*;
import FactoryPattern.AbstractFactory.ConcretePizzas.Ingredients.Variations.*;
import FactoryPattern.AbstractFactory.ConcretePizzas.Ingredients.Vegetables.Garlic;
import FactoryPattern.AbstractFactory.ConcretePizzas.Ingredients.Vegetables.Mushroom;
import FactoryPattern.AbstractFactory.ConcretePizzas.Ingredients.Vegetables.Onion;
import FactoryPattern.AbstractFactory.ConcretePizzas.Ingredients.Vegetables.RedPepper;

public class BerlinPizzaIngredientsFactory implements PizzaIngredientsFactory {

    public Dough createDough(){
        return new ThinCrustDough();
    }

    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    public Cheese createCheese(){
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies(){
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    public Clam createClam(){
        return new FreshClam();
    }
}


// concrete factory