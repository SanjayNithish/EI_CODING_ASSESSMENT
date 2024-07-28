package DesignPattern.BehavioralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Subject interface
interface WeatherSubject {
    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}

// Concrete Subject
class WeatherStation implements WeatherSubject {
    private List<WeatherObserver> observers;
    private float temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }
}

// Observer interface
interface WeatherObserver {
    void update(float temperature);
}

// Concrete Observer
class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Phone display updated: Current temperature is " + temperature + "°C");
    }
}

// Usage example
public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        station.registerObserver(phoneDisplay);
        station.setTemperature(25.0f); 
    }
}


