package lesson2;

public class SecondProgram {


    public static void main(String[] args) {
        long summa = summa(3, 5);
        System.out.println(summa);
        long otherSumma = summa(5, 5);
        System.out.println(otherSumma);

        long resultOfMinus = minus(2, 18);
        System.out.println(resultOfMinus);


}

    /**
     * Метод будет складывать два аргумента и возвращать результат этой операции
     *
     * @param arg1 первый аргумент
     * @param arg2 Второй аргумент
     * @return результат сложения двух чисел
     */
    public static int summa(int arg1, int arg2) {
        //Коммент. Просто коммент)
        int result = arg1 + arg2;
        return result;
    }

    public static int minus(int arg1, int arg2) {
        //Коммент. Просто коммент)
        return arg1 - arg2;
    }

    public static int multiplyAndSumma(int arg1) {
       int result 3 * arg1 + 15;
       result = result - 38;
       return result;
       // Не дописал
    }
}
