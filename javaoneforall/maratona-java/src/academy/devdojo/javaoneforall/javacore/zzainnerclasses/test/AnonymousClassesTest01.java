package academy.devdojo.javaoneforall.javacore.zzainnerclasses.test;

class Animal {
    public void walk() {
        System.out.println("I keep on walking\n" + "They tried but can't stop me.");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("I keep on dolking\n" + "They tried but can't stop me.");
            }

        };
        animal.walk();
    }
}
