package decoratorPattern;

/*
    Is-A Beverage and HAS-A Beverage
    classes extends it implements methods
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract double cost();

    public abstract String getDescription();

}
