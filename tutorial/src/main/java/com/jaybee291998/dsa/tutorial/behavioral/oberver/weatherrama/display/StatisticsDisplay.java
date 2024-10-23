package com.jaybee291998.dsa.tutorial.behavioral.oberver.weatherrama.display;

import com.jaybee291998.dsa.tutorial.behavioral.oberver.domain.Observer;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.domain.Subject;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.domain.WeatherEvent;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.weatherrama.domain.DisplayElement;

public class StatisticsDisplay implements DisplayElement, Observer {
    private double averageTemperature;
    private double minTemperature = Double.MAX_VALUE;
    private double maxTemperature = Double.MIN_VALUE;
    private double totalRecordedTemperature = 0;
    private double totalNumberOfTemperatureRecorded = 0;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(WeatherEvent event) {
        totalNumberOfTemperatureRecorded += 1;
        totalRecordedTemperature += event.getTemperature();
        this.minTemperature = Math.min(event.getTemperature(), this.minTemperature);
        this.maxTemperature = Math.max(event.getTemperature(), this.maxTemperature);
        this.averageTemperature = this.totalRecordedTemperature / this.totalNumberOfTemperatureRecorded;
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + this.averageTemperature + "/" + this.maxTemperature + "/" + this.minTemperature);
    }
}
