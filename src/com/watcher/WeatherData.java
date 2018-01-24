package com.watcher;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperatre;
    private float humidity;
    private float pressure;

    public WeatherData() {
//        observers = new ArrayList<>();
    }

//    public void registerObserver(Observer o) {
//        observers.add(o);
//    }
//
//    public void removeObserver(Observer o) {
//        int i = observers.indexOf(o);
//        if (i >= 0) {
//            observers.remove(i);
//        }
//    }
//
//    public void notifyObservers() {
//        for (int i = 0; i < observers.size(); i++) {
//            Observer observer = observers.get(i);
//            observer.update(temperatre, humidity, pressure);
//        }
//    }

    public void measurementsChanged () {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperatre, float humidity, float pressure) {
        this.temperatre = temperatre;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperatre;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
