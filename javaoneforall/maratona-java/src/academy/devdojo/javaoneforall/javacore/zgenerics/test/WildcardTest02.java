package academy.devdojo.javaoneforall.javacore.zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

    }

    // type erasure
    private static void printAppointment(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.appointment();
        }
//        animals.add(new Dog());
    }

    private static void printAppointmentAnimal(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
