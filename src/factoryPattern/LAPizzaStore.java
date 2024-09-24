package factoryPattern;

public class LAPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch(type) {
            case "cheese":
                return  new LAStyleCheesePizza();

//            case "veggie":
//                return  new LAStyleVeggiePizza();
//
//            case "clam":
//                return  new LAStyleClamPizza();
//
//            case "pepperoni":
//                return new LAStylePepperoniPizza();

            default:
                return null;
        }
    }
}
