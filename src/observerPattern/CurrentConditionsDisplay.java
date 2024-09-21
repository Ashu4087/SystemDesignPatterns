package observerPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData w) {
        this.weatherData = w;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Measurements: " + temp + "F degree and "+ humidity + "% humidity");
    }

    public void removeObserver() {
        weatherData.removeObserver(this);
    }
}
