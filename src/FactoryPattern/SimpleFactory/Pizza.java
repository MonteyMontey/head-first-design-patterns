package FactoryPattern.SimpleFactory;

public abstract class Pizza {

    public String name = "Pizza";

    public String getName(){
        return name;
    }

    public abstract void prepare();
    public abstract void bake();
    public void cut(){
        // this is the same for all pizzas so the logic can be here
    }
    public void box(){
        // this is the same for all pizzas so the logic can be here
    }
}
