package strategyPattern.behaviorClasses;

import strategyPattern.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't Fly");
    }
}
