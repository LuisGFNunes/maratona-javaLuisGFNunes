package academy.devdojo.javaoneforall.javacore.xserialization.test;

import academy.devdojo.javaoneforall.javacore.xserialization.domain.Classroom;
import academy.devdojo.javaoneforall.javacore.xserialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(2510L, "Natsuki", "M@ngaIsL1ter@ctur3!");
        Classroom classroom = new Classroom("14A");
        student.setClassroom(classroom);
        serialize(student);
        deserialize();

    }

    private static void serialize(Student student){
        Path path = Paths.get("folder/student.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserialize(){
        Path path = Paths.get("folder/student.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}


