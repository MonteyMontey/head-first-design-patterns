package FactoryPattern.SimpleFactory;

public class PizzaStore {

    // if you have a franchise and you have multiple stores,
    // there could be different factories, one for berlin-style pizza and one for Kaiserslautern-style pizza e.g.
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
