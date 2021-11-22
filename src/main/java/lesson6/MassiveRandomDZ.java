package lesson6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MassiveRandomDZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int arraySize = scanner.nextInt();


        System.out.println("Длинна массива равна: " + arraySize);
        double[] array = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = (double) Math.random();
            System.out.println(array[i]);


        }
        System.out.println("Максимальное число в массиве: " + maxArray(array));
        System.out.println("Минимальное число в массиве: " + minArray(array));
        System.out.println("Среднее число в массиве: " + avgArray(array, arraySize));

    }
    public static double maxArray(double[] array) {
        double max = array[0];
        int i = 1;
        while (i < array.length) {
            if (max < array[i]) {
                max = array[i];
            }
            i++;
        }
        return max;
    }

    public static double minArray(double[] array) {
        double min = array[0];
        int i = 1;
        while (i < array.length) {
            if (min > array[i]) {
                min = array[i];
            }
            i++;
        }
        return min;
    }

    public static double avgArray(double[] array, int arraySize) {
        double avg = 0;
        int i = 0;
        while (i < array.length) {
            avg += array[i];
            i++;
        }
        avg = avg / arraySize;
        return avg;
    }
}


