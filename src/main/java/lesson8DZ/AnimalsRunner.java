package lesson8DZ;

public class AnimalsRunner {

    public static void main(String[] args) {
        Animals cat = new CatDZ("Муська", "Кошка", "Мяу");
        Animals dog = new Dog("Бобик","Собака","Гав");
        Animals bird = new Bird("Кеша","Птица","Чирик");

        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println(bird.toString());
        Animals[] animal = new Animals[] {cat,dog,bird};

        System.out.println("----------------------------");
        System.out.println(cat.toString());

    }
}
