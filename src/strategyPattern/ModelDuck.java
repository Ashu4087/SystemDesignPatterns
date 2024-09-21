package strategyPattern;

import strategyPattern.behaviorClasses.FlyNoWay;
import strategyPattern.behaviorClasses.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm nodel duck");
    }
}
