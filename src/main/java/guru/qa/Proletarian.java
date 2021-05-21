package guru.qa;

// наследник
public class Proletarian extends Human {

    public Proletarian(String name) {
        super(name);
    }

    void sayRespectToLenin() {
        System.out.println("Слава Ленину!");
    }
}
