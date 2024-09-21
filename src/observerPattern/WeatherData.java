package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    public void measurementsChanges() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanges();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getPressure() {
        return this.pressure;
    }

    public float getHumidity() {
        return this.humidity;
    }


}
