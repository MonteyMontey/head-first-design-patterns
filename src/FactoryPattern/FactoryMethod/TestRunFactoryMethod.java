package FactoryPattern.FactoryMethod;

import FactoryPattern.SimpleFactory.Pizza;

public class TestRunFactoryMethod {

    public static void main(String[] args){
        PizzaStore berlinStore = new BerlinPizzaStore();
        PizzaStore kaiserslauternStore = new KaiserslauternPizzaStore();

        Pizza pizza1 = berlinStore.orderPizza("cheese");
        System.out.println(pizza1.getName());

        Pizza pizza2 = kaiserslauternStore.orderPizza("cheese");
        System.out.println(pizza2.getName());
    }
}


// the factory method is seen as the nicer and more flexible approach than simple factory

// advantages of factory vs no factory:
// - code separation and avoiding code duplication
// - stores have less dependencies because they don't need to instantiate all pizza objects themselves
// -> dependency inversion principle, stores only need to deal with the pizza abstraction not concrete pizzas
