package StrategyPattern.ConcreteBehaviors;

import StrategyPattern.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("I can't fly!");
    }
}
