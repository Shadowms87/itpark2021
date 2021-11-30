package lesson8DZ;

public class Animals {
    private String name;
    private String animal;
    private String voice;

    public Animals(String name, String animal, String voice) {
        this.name = name;
        this.animal = animal;
        this.voice = voice;
    }



    @Override
    public String toString() {
        return
                "Это животное - " + animal  +
                ", по имени " + name +
                ". Животное издает звук: " + voice;


    }
}
