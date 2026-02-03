package academy.devdojo.javaoneforall.javacore.zzestreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Arthur", "Eve", "Luke");
        List<String> developers = List.of("Yuri", "Fern", "Stark");
        List<String> students = List.of("Sayori", "Yuta", "Maki");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);


        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
