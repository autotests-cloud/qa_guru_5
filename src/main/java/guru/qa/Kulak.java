package guru.qa;

// наследник
public class Kulak extends Human {

    public Kulak(String name) {
        super(name);
    }

    public Kulak noFart() {
        System.out.println("Меня зовут " + super.name + " и я Ненавижу Ленина");
        return this;
    }
}
