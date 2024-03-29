package StrategyPattern.ConcreteDucks;

import StrategyPattern.ConcreteBehaviors.FlyNoWay;
import StrategyPattern.ConcreteBehaviors.Quack;
import StrategyPattern.Duck;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
