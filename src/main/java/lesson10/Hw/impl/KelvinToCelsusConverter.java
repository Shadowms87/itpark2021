package lesson10.Hw.impl;

import lesson10.Hw.Convertable;
import lesson10.Hw.TemperatureValue;

import static lesson10.Hw.impl.CelsiusToKelvinConverter.DELTA;

public class KelvinToCelsusConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() - DELTA;
    }
}
