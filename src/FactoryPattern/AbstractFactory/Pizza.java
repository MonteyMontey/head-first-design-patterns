package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.ConcretePizzas.Ingredients.*;

public abstract class Pizza {
    public String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    public Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    public abstract void prepare();

    void bake(){
        // bake
    }

    void cut(){
        //cut
    }

    void box(){
        //box
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
