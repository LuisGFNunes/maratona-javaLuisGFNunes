package academy.devdojo.javaoneforall.javacore.xserialization.domain;

public class Classroom {
    private String name;

    public Classroom(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
