package academy.devdojo.javaoneforall.javacore.ycollections.test;

import academy.devdojo.javaoneforall.javacore.ycollections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("33212", "Samsung");
        Smartphone s3 = new Smartphone("41233", "Pixel");
        Smartphone s4 = new Smartphone("54312", "Xiaomi");
        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        smartphones.add(s4);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
    }
}
