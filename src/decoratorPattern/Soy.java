package decoratorPattern;

public class Soy extends CondimentDecorator {
    double cost = 0.5;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }
}
