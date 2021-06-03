package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class EnumMain {

    private static final List list = new ArrayList();

    public static void main(String[] args) {
        ImageFormat format = ImageFormat.lookup("Формат картинки png");
        System.out.println(format.name());
    }
}
