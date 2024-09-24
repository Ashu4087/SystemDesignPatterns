package factoryPattern;
/*
    Factory pattern is used to create objects
    Factory Method (abstract) -> child classes (Factory Class) will implement it
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
    /*
        Abstract Factory Method
     */
    public abstract Pizza createPizza(String type);
}
