package guru.qa;

public class Main {

    static NKVD nkvd = new NKVD();

    // целые числа
    byte byteVar;
    short aShort;
    int anInt = 1;
    long aLong;

    // числа с плавающей точкой
    double aDouble = 1.23;
    float aFloat;

    // логический тип
    boolean aBoolean = true;

    // символ
    char aChar = 'c';

    public static void main(String[] args) {
        Kulak kulak = new Kulak("Иван");
        Kulak anotherKulak = new Kulak("Борис");

        kulak.age = 31;
        anotherKulak.age = 19;

        System.out.println(kulak.name);
        System.out.println(anotherKulak.name);
        System.out.println(kulak.age);
        System.out.println(anotherKulak.age);
        kulak.noFart().noFart().noFart();
        anotherKulak.noFart();

        int kulakAge = kulak.getAge();
        System.out.println(kulakAge);
        System.out.println(anotherKulak.age);
        nkvd.checkAge(anotherKulak);
    }
}
