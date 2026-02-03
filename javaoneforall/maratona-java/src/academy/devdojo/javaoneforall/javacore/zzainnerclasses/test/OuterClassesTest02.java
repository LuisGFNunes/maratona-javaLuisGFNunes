package academy.devdojo.javaoneforall.javacore.zzainnerclasses.test;

public class OuterClassesTest02 {

    private String name = "Edward";

    void method(final String param) {
        final String lastName = "Elric";

        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.method("param");
    }
}
