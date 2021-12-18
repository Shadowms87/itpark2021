package lesson12HW;

public class MyArrayDataException extends MyException{

    public MyArrayDataException (int row, int col) {
        super(String.format("В ячейке лежат не верные данные [%d, %d]", row, col));
    }
}
