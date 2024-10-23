package com.jaybee291998.dsa.tutorial.behavioral.oberver.weatherrama.domain;

import com.jaybee291998.dsa.tutorial.behavioral.oberver.domain.Observer;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.domain.Subject;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.domain.WeatherEvent;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.domain.WeatherEventImpl;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class WeatherData implements Subject, TemperatureProvider, HumidityProvider, PressureProvider {
    List<Observer> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;

    public void measurementsChanged() {
        notifyObservers();
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
    public void notifyObservers() {
        // to do encapsulate
        final WeatherEvent weatherEvent = WeatherEventImpl.builder()
                .humidity(this.humidity)
                .pressure(this.pressure)
                .temperature(this.temperature)
                .build();
        observers.forEach(observer -> {
            observer.update(weatherEvent);
        });
    }

    public void setMeasurement(double temperature, double humidity, double pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanged();
    }
}
