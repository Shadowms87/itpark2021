package lesson12;

public class ExeptionRunner {

    public static void main(String[] args) {
        boolean succeeded = false;
        try {
            System.out.println(divide (5, 0));
            succeeded = true;
        }
        catch (ArithmeticException exception) {
            exception.printStackTrace();
            succeeded = false;
        }
        finally {
            System.out.println(succeeded ? "Выполнение операции завершено успершно" : "Выполнение операции завершено неуспешно");
        }


    }

    public static int divide(int a, int b) {
        return 0;
    }
}
