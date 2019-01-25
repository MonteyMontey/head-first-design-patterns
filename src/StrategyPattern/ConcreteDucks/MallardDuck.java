package StrategyPattern.ConcreteDucks;

import StrategyPattern.ConcreteBehaviors.FlyWithWings;
import StrategyPattern.ConcreteBehaviors.Quack;
import StrategyPattern.Duck;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
