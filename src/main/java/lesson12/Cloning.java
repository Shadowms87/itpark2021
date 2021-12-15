package lesson12;

public class Cloning {

    private String name;
    private Long id;
    private Double size;

    public Cloning(Cloning copy) {
        this.id = copy.id;
        this.name = copy.name;
        this.size = copy.size;


    }

}
