package lesson7;

public class HumanRunner {
    public static void main(String[] args) {
        Human me = new Human();
        me.name = "Vitaliy";
        me.surname = "Ivanov";
        me.age = 33;
        me.weight = 82;
        me.height = 190;
        me.hasQrCode = false;

        Human nataliaIvanovna = new Human();
        nataliaIvanovna.name = "Natalia";
        nataliaIvanovna.surname = "Petrova";
        nataliaIvanovna.age = 27;
        nataliaIvanovna.weight = 55;
        nataliaIvanovna.height = 165;
        nataliaIvanovna.hasQrCode = true;

        Human inkognito = new Human("unknown", "Unknown", -1,
                                    -1, -1, null);

        Human vasyaPupkin = new Human("Vasiliy","Pupkin", 50);

        System.out.println(me == vasyaPupkin);
        System.out.println(me == me);

        Human[] humans = new Human[] {me, nataliaIvanovna, inkognito, vasyaPupkin};
        for (Human human: humans) {
            if (50 == human.age) {
                System.out.println("Человек с именем " + human.name + " и фамилия " + human.surname +
                        "имеет возраст 50");
            }
        }

        me.beOlder();{
            System.out.println("Мне через год будет " + me.age);
        }

        me.setName("Ivan");
        System.out.println("Мое имя изменено на " + me.name);



    }
}
