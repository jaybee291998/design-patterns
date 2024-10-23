package com.jaybee291998.dsa.tutorial.behavioral.oberver.weatherrama;

import com.jaybee291998.dsa.tutorial.behavioral.oberver.weatherrama.display.CurrentConditionDisplay;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.weatherrama.display.StatisticsDisplay;
import com.jaybee291998.dsa.tutorial.behavioral.oberver.weatherrama.domain.WeatherData;

public class WeatherRama {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurement(36.9, 77, 10234);
        weatherData.setMeasurement(36.8, 77, 10200);
        weatherData.setMeasurement(37.0, 78, 10230);
        weatherData.setMeasurement(36.9, 77, 10234);
    }
}
