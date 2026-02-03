package academy.devdojo.javaoneforall.javacore.zzdoptional.test;


import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Hello");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        Optional<String> nameOptional = findName("Shinji");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(nameOptional);
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> namesList = List.of("Shinji", "Asuka", "Ayanami");
        int i = namesList.indexOf(name);
        if (i != 1) {
            return Optional.of(namesList.get(i));
        }
        return Optional.empty();
    }
}
