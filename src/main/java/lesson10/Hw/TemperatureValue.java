package lesson10.Hw;

public class TemperatureValue {

    private final double value;
    private final TemperatureMeasurementSystem measurementSystem;

    public TemperatureValue(double value, TemperatureMeasurementSystem measurementSystem) {
        this.value = value;
        this.measurementSystem = measurementSystem;
    }

    public double getValue() {
        return value;
    }

    public TemperatureMeasurementSystem getMeasurementSystem() {
        return measurementSystem;
    }
}