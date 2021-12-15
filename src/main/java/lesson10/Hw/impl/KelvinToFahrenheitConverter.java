package lesson10.Hw.impl;

import lesson10.Hw.Convertable;
import lesson10.Hw.TemperatureValue;



public class KelvinToFahrenheitConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - CelsiusToKelvinConverter.DELTA) * FahrenheitToCelsiusConverter.KOEFFICIENT
                + FahrenheitToCelsiusConverter.DELTA;
    }
}
