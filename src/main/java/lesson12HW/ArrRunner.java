package lesson12HW;

public class ArrRunner {

    public static void main(String[] args) {

        String[][] correctMatrix = {
                {"6", "7", "1", "5"},
                {"3", "1", "5", "2"},
                {"5", "7", "7", "3"},
                {"9", "1", "7", "1"}
        };

        String[][] wrongSizeMatrix = {
                {"6", "7", "1", "5"},
                {"3", "1"},
                {"5", "7", "7", "3"},
                {"9", "1", "7", "1"}
        };

        String[][] wrongChar = {
                {"6", "7", "1", "5"},
                {"в", "1", "0", "2"},
                {"5", "7", "7", "3"},
                {"9", "1", "7", "1"}
        };

        try {
            System.out.println(ArrSum.strArr(correctMatrix));
        } catch (MyException e) {
            e.getMessage();
        }


        try {
            System.out.println(ArrSum.strArr(wrongSizeMatrix));
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(ArrSum.strArr(wrongChar));
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
    }
}
