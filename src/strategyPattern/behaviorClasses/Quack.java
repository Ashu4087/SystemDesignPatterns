package strategyPattern.behaviorClasses;


import strategyPattern.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
