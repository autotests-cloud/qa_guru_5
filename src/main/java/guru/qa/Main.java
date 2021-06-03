package guru.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

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
        String[] stringArray;
        stringArray = new String[] {"Vasya", "Dima", "Irina"};

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("Dima")) {
                return;
            }
            System.out.println(stringArray[i]);
        }

        for (String element : stringArray) {
            System.out.println(element);
        }





        Kulak kulak = new Kulak("Иван");
        Kulak anotherKulak = new Kulak("Борис");

        kulak.setAge(31);
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

        List<String> stringList;
        stringList = List.of("Vasya", "Dima", "Irina", "Irina");
        Set<String> stringSet;
        stringSet = Set.of("Vasya", "Dima", "Irina");

        Map<String, Human> humanMap = new HashMap<>();
        humanMap.put("кулак", kulak);
        humanMap.get("кулак");

        Arrays.stream(stringArray);

        Stream.of("Vasya", "Dima", "Irina", "Irina");

        stringList.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> !x.equals("DIMA"))
                .forEach(x -> System.out.println(x));

        for (String element : stringList) {
            System.out.println(element);
        }

        for (String element : stringSet) {
            System.out.println(element);
        }
    }
}
