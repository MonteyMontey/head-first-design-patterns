package StrategyPattern;

import StrategyPattern.ConcreteBehaviors.FlyRocketPowered;
import StrategyPattern.ConcreteDucks.MallardDuck;
import StrategyPattern.ConcreteDucks.ModelDuck;

public class DuckSimulator {
    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}


/* Definition: Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
* Strategy lets the algorithm vary independently from clients that use it.
*
* In my words: in this example the encapsulated algorithm is the fly&quack behavior, which you can change at any time,
 * so the strategy pattern encapsulates code, that can be used in other objects too by simple composition*/