package lesson5;

public class IntRunner {
    public static void main(String[] args) {
        int i = 5;
        String str = "Привет";
        String another = new String("Hello");
        Integer value = 5;
        int anotherValue = value;
        Integer nullValue = null;
        System.out.println(nullValue +10);
        Long bigValue = 1256412212L;
        Character symbol = 'в';
        Integer integer = Integer.valueOf("12578");
        System.out.println("Проблем с конвертацией у числа " + integer + " не обнаружено");

    }
}
