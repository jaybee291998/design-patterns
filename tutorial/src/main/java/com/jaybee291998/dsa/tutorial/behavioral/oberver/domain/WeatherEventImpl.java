package com.jaybee291998.dsa.tutorial.behavioral.oberver.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class WeatherEventImpl implements WeatherEvent {
    private double temperature;
    private double humidity;
    private double pressure;
}
