import strategyPattern.MallardDuck;
import strategyPattern.ModelDuck;
import strategyPattern.behaviorClasses.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        //model Duck

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}