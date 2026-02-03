package academy.devdojo.javaoneforall.javacore.ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(4);
        numbers.add(2);

        // - (point of inserction) - 1
        // index 0, 1, 2, 3
        // value 0, 1, 2, 4
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 4));
        System.out.println(Collections.binarySearch(numbers, -1));
    }
}
