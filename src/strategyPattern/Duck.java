package strategyPattern;
/*
    Favor Composition over inheritance
 */

/*
    why to use strategy-pattern --> 
    when to use strategy-pattern --> when child classes implements same methods 
        (creates code duplications, lack of reusability)
 */

//interface Flyable {
//    void fly();
//}
//
//interface Quackable {
//    void quack();
//}
//
//public class Duck {
//    void swim() {
//        //
//    }
//    void display() {
//        //
//    }
//    //fly();
//    //quack();
//    //here not all duck fly and quack so instead of adding methods to concrete class
//    // let's create interface
//}
//
//class MallardDuck extends Duck implements Flyable, Quackable {
//    public void display() {
//        //
//    }
//    public void fly() {
//        // can fly
//    }
//    public void quack() {
//        //quack
//    }
//}
//
//class RedheadDuck extends Duck implements Flyable, Quackable {
//    public void display() {
//        //
//    }
//    public void fly() {
//        //can fly (duplicate coe) (to resolve this we use strategy pattern.
//    }
//    public void quack() {
//        //quack (duplicate code)
//    }
//}
//class RubberDuck extends Duck implements  Quackable {
//    public void display() {
//        //
//    }
//
//    public void quack() {
//        //quack
//    }
//}
//
//class DecoyDuck extends Duck {
//    public void display() {
//        //
//    }
//
//}


/*
    Seperate behaviors/functionality that changes (fly and quack)
    create behaviors classes which implements changing behaviors
 */

/*
    create behaviors classes
 */



public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }


    //To update behavior dynamically(runtime) add setter methods

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }


}