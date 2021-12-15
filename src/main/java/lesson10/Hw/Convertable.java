package lesson10.Hw;

import lesson10.Hw.impl.CelsiusToKelvinConverter;
import lesson10.Hw.impl.IdentityConverter;
import lesson10.Hw.impl.KelvinToCelsusConverter;

public interface Convertable {
    double convert(TemperatureValue value);

    static double convert(TemperatureValue value, TemperatureMeasurementSystem toSystem) {
        switch (toSystem) {
            case CELSIUS -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        return new IdentityConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToCelsusConverter().convert(value);
                    }
                }
            }
            case KELVIN -> {
                switch (value.getMeasurementSystem()) {
                    case KELVIN -> {
                        return new IdentityConverter().convert(value);
                    }
                    case CELSIUS -> {
                        return new CelsiusToKelvinConverter().convert(value);
                    }
                }
            }
        }
        return -1;
    }

    static double convert(double value, TemperatureMeasurementSystem fromSystem, TemperatureMeasurementSystem toSystem) {
        return Convertable.convert(new TemperatureValue(value, fromSystem), toSystem);
    }
}