package com.jaybee291998.dsa.tutorial.behavioral.oberver.weatherrama.display;

import com.jaybee291998.dsa.tutorial.behavioral.oberver.domain.Observer;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.domain.Subject;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.domain.WeatherEvent;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.weatherrama.domain.DisplayElement;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.weatherrama.domain.WeatherData;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(WeatherEvent event) {
        this.temperature = event.getTemperature();
        this.humidity = event.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");
    }
}
