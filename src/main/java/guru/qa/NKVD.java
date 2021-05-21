package guru.qa;

public class NKVD {

    void doArrest(Kulak kulak) {
        kulak.noFart();
        kulak.name = "Раскулаченный";
    }

    void checkAge(Kulak kulak) {
        if (kulak.age >= 18) {
            System.out.println("ты попал");
            doArrest(kulak);
        } else {
            System.out.println("детей не обижаем");
        }
    }
}
