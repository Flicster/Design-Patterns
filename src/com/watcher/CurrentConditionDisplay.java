package com.watcher;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Observable observable) {
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        this.pressure = pressure;
//        display();
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity
            + "% humidity");
    }
}
