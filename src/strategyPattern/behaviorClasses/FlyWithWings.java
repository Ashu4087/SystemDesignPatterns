package strategyPattern.behaviorClasses;

import strategyPattern.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly () {
        System.out.println(" I'm Flying");
    }
}
