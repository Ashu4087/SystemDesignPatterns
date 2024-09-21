package strategyPattern;

import strategyPattern.behaviorClasses.FlyWithWings;
import strategyPattern.behaviorClasses.Quack;

public class MallardDuck extends Duck {
    public MallardDuck () {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
