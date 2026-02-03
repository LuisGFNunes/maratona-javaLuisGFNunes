package academy.devdojo.javaoneforall.javacore.zgenerics.test;

abstract class Animal {
    public abstract void appointment();
}

class Dog extends Animal {
    @Override
    public void appointment() {
        System.out.println("Dog appointment");
    }
}

class Cat extends Animal {
    @Override
    public void appointment() {
        System.out.println("Cat appointment");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog(), new Dog(), new Dog(), new Dog()};
        Cat[] cats = new Cat[]{new Cat(), new Cat()};

        printAppointment(dogs);
        printAppointment(cats);
    }
    private static void printAppointment(Animal[] animals) {
        for (Animal animal : animals) {
            animal.appointment();
        }
//        animals[0] = new Dog();

    }
}
