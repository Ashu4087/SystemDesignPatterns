package factoryPattern;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch(type) {
            case "cheese":
                return  new NYStyleCheezePizza();

//            case "veggie":
//                return  new NYStyleVeggiePizza();
//
//            case "clam":
//                return  new NYStyleClamPizza();
//
//            case "pepperoni":
//                return new NYStylePepperoniPizza();

            default:
                return null;
        }
    }
}
