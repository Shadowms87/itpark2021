package lesson4;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println(getSolutionOfSphetophore("Красный"));
        System.out.println(getSolutionOfSphetophore("Желтый"));
        System.out.println(getSolutionOfSphetophore("Зеленый"));

    }

    public static String getSolutionOfSphetophore (String color) {
        String result;

        switch (color) {
            case "Красный": {
                result = "Проход запрещен";
                break;
            }
            case "Желтый": {
                result = "Будь внимателен";
                break;
            }
            case "Зеленый": {
                result = "Проход разрешен";
                break;
            }
            default: {
                result = "";
                break;
            }
        }
        return result;
    }
}
