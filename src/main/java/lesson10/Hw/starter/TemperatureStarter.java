package lesson10.Hw.starter;

import lesson10.Hw.Convertable;
import lesson10.Hw.TemperatureMeasurementSystem;


import java.util.Scanner;

public class TemperatureStarter {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в конвертер. Тут ты сможешь переводить температуру из одной системы в другую");
        System.out.println("Введи пожалуйста значение для конвертации");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            String inputValue = scanner.next();
            System.out.printf("Вместо % ожидали значение температуры как вещественного числа \n",inputValue);
        }
        double value = scanner.nextDouble();
        System.out.println("Введи пожалуйста исходную систему измерений (возможные варианты - C, K, F):");
        String temperatureSystem = scanner.next();
        System.out.println("Введи пожалуйста систему измерений, в которую будет переведено указанное ранее значение" +
                " (возможные варианты - C, K, F):");
        String destinationTemperatureSystem = scanner.next();
        System.out.printf("Результат: %.2f\n", Convertable.convert(value,
                TemperatureMeasurementSystem.of(temperatureSystem),
                TemperatureMeasurementSystem.of(destinationTemperatureSystem)));
    }
}
