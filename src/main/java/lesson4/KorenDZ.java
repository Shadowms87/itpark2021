package lesson4;

import java.util.Scanner;

public class KorenDZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления корня квадратного: ");
        int value = scanner.nextInt();

        int step = 1;

        while (step < value) {
            // расчёты
            step++;
            int result = step * step;
            if (result == value) {
                System.out.println("Квадратный корень равен: " + step);
                return;
            }

            if (step >= value) {
                System.out.println("Нет доступных верных решений, среди целых чисел");


        }
    }
}
}