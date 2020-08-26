package it.pipitone.matteo.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(getTemperature(), getHumidity(), getPressure()));
    }

    int getTemperature(){
        // some code here
        return 25;
    }

    int getHumidity(){
        // some code here
        return 80;
    }

    int getPressure(){
        // some code here
        return 1;
    }

}
