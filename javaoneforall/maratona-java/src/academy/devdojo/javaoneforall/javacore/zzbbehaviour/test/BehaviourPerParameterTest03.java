package academy.devdojo.javaoneforall.javacore.zzbbehaviour.test;

import academy.devdojo.javaoneforall.javacore.zzbbehaviour.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviourPerParameterTest03 {
    private static List<Car> cars = List.of(new Car("black", 2020), new Car("red", 2019), new Car("blue", 1998));

    public static void main(String[] args) {

        List <Car> blueCars = filter(cars, car -> car.getColor().equals("blue"));
        List <Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List <Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2020);
        System.out.println(blueCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);

        List <Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }

}
