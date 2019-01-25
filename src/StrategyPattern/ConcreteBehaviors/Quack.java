package StrategyPattern.ConcreteBehaviors;

import StrategyPattern.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack(){
        System.out.println("Quack");
    }
}
