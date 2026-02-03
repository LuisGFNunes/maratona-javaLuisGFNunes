package academy.devdojo.javaoneforall.javacore.zzestreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        System.out.println(integers.stream().reduce(0, (x, y) -> x - y));

        System.out.println(integers.stream().reduce(0, Integer::sum));

        System.out.println(integers.stream().reduce(0, (x, y) -> x > y ? x : y));
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}
