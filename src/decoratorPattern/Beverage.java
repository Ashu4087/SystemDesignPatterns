package decoratorPattern;
/*
    Open for extension but closed for modification
 */
public abstract class Beverage {
    String description = "unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    };
}
