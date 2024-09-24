package factoryPattern;

public class LAStyleCheesePizza extends Pizza {

    public LAStyleCheesePizza() {
        name = "LA Style Deep Dish Cheese Pizza ";
        dough = "Extra Thin Crust Dough";
        sauce = "Plum Tomato sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
