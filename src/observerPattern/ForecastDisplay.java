package observerPattern;

public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;

    public ForecastDisplay(WeatherData w) {
        this.weatherData = w;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float pressure, float humidity) {
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: Weather on the Way!");
    }

    public void removeObserver() {
        weatherData.removeObserver(this);
    }
}

