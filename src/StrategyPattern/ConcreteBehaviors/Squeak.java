package StrategyPattern.ConcreteBehaviors;

import StrategyPattern.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack(){
        System.out.println("Squeak");
    }
}
