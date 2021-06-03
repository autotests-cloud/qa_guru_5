package guru.qa;


import java.util.Arrays;
import java.util.Objects;

// суперклас
public class Human extends Object {

    private static String country = "СССР";

    protected String name;
    protected int age;
    protected String[] achievements;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Arrays.equals(achievements, human.achievements);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age);
        result = 31 * result + Arrays.hashCode(achievements);
        return result;
    }
}
