package academy.devdojo.javaoneforall.javacore.zzainnerclasses.test;

public class OuterClassesTest01 {
    private String name = "Edward Elric";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 obj = new OuterClassesTest01();
        Inner inner = obj.new Inner();

        inner.printOuterClassAttribute();

        Inner inner1 = new OuterClassesTest01().new Inner();
        inner1.printOuterClassAttribute();
    }
}
