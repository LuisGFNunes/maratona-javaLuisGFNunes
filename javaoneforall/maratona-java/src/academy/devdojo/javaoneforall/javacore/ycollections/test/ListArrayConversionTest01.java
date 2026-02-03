package academy.devdojo.javaoneforall.javacore.ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;

        Integer[] listToArray = numbers.toArray(new Integer[0]);

        List<Integer> arrayToList = Arrays.asList(numbersArray);
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(listToArray));
        System.out.println("List to Array:\n" + "\t" + numbersList);
        System.out.println("Array to List:\n" + "\t" + arrayToList);
    }
}
