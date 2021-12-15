package lesson10.Hw.impl;

import lesson10.Hw.Convertable;
import lesson10.Hw.TemperatureValue;

public class CelsiusToKelvinConverter implements Convertable {

    public static final double DELTA = 273.15;

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() + DELTA;
    }
}
