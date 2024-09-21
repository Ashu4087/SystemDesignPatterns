package observerPattern;

public class StaticsticsDisplay implements Observer, DisplayElement {

    private float temp;
    private WeatherData weatherData;

    public StaticsticsDisplay(WeatherData w) {
        this.weatherData = w;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        this.temp = weatherData.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature: " + temp + "/" + temp+ "/ "+ temp + "/ ");
    }

    public void removeObserver() {
        weatherData.removeObserver(this);
    }
}
