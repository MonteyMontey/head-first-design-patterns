package StrategyPattern.ConcreteBehaviors;

import StrategyPattern.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("*Silence*");
    }
}
