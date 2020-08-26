package it.pipitone.matteo.pattern.observer;

import it.pipitone.matteo.pattern.observer.displays.GeneralDisplay;
import it.pipitone.matteo.pattern.observer.displays.StatisticDisplay;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        weatherData.registerObserver(new GeneralDisplay());
        weatherData.registerObserver(new StatisticDisplay());

        weatherData.notifyObserver();
    }
}
