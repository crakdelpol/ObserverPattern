package it.pipitone.matteo.pattern.observer.displays;

import it.pipitone.matteo.pattern.observer.Observer;

public class StatisticDisplay implements Observer {
    @Override
    public void update(int temperature, int humidity, int pressure) {
        System.out.println("Update StatisticDisplay display with new Parameters");
    }
}
