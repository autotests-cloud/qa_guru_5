package guru.qa;

// наследник
public class Kulak extends Human {


    public Kulak(String name) {
        super(name);
    }

    Kulak noFart() {
        System.out.println("Меня зовут " + name + " и я Ненавижу Ленина");
        return this;
    }
}
