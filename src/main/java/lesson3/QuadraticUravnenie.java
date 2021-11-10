package lesson3;

import static java.lang.Math.sqrt;

import java.util.Scanner; //код со сканером не получился

    public class QuadraticUravnenie {
        public static void main(String[] args) {
            double a = 2;
            double b = 16;
            double c = 32;


            //Вычисляем корни
            double root1 = ((-1 * b) + sqrt(getDiscriminant(a, b, c))) / (2 * a);
            double root2 = ((-1 * b) - sqrt(getDiscriminant(a, b, c))) / (2 * a);

            // Проверка, что бы "a" не был равен нулю.
            if (a == 0) {
                System.out.println("Первый коэффициент не может быть 0");
                // Если дискриминант = 0, то нет решений
            } else if (getDiscriminant(a, b, c) < 0) {
                System.out.println("Нет действительных решений уравнения");
            }
            // Если корни равны, то выводим только один корень (x1)
            else if (root1 == root2) {
                System.out.println("Корни x1 и x2 равны = " + root1);
                // Если корни различны, то выводим оба корня
            } else {
                System.out.println("Корни x1 и x2 равны = " + root1 + " " + root2);
            }
        }

    private static double getDiscriminant(double a, double b, double c) {
        double discr = (b * b) - (4 * a * c);
        return discr;

    }
    }
