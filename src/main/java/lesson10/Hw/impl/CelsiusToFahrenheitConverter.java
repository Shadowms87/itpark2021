package lesson10.Hw.impl;

import lesson10.Hw.Convertable;
import lesson10.Hw.TemperatureValue;

import static lesson10.Hw.impl.FahrenheitToCelsiusConverter.DELTA;
import static lesson10.Hw.impl.FahrenheitToCelsiusConverter.KOEFFICIENT;

public class CelsiusToFahrenheitConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() * KOEFFICIENT + DELTA;
    }
}
