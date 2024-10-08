import commandPattern.AirConditioner;
import commandPattern.MyRemoteControl;
import commandPattern.TurnOfAcCommand;
import commandPattern.TurnOnAcCommand;
import decoratorPattern.*;
import factoryPattern.*;
import observerPattern.CurrentConditionsDisplay;
import observerPattern.ForecastDisplay;
import observerPattern.StaticsticsDisplay;
import observerPattern.WeatherData;
import singleton.SingletonEager;
import singleton.SingletonLazyLoad;
import strategyPattern.MallardDuck;
import strategyPattern.ModelDuck;
import strategyPattern.behaviorClasses.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {

        /*
            Strategy Pattern
         */
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        //model Duck

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();


        /*
            Observer pattern
         */

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StaticsticsDisplay staticsticsDisplay = new StaticsticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(100, 55, 40.5f);
        weatherData.setMeasurements(95, 50, 32.5f);
        weatherData.setMeasurements(98, 45, 25.5f);

        /*
            Decorator Pattern
         */

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+ " $"+ beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+ beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+ beverage2.cost());


        /*
            Factory Pattern
         */

//        PizzaStore pizzaStore = new PizzaStore();
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore lAPizzaStore = new LAPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ask Ordered a " + pizza.getName());
        pizza = lAPizzaStore.orderPizza("cheese");
        System.out.println("Ask again Ordered a " + pizza.getName());

        /**
         * Singleton
         */

        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonLazyLoad singletonLazyLoad = SingletonLazyLoad.getInstance();

        /**
         * Command
         */

        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl myRemoteControl = new MyRemoteControl();
        myRemoteControl.setCommand(new TurnOnAcCommand(airConditioner), new TurnOfAcCommand(airConditioner));
        myRemoteControl.pressButton(true);
        myRemoteControl.pressButton(false);

    }
}