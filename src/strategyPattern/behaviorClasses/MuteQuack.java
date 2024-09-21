package strategyPattern.behaviorClasses;

import strategyPattern.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
