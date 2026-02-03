package academy.devdojo.javaoneforall.javacore.zzbbehaviour.test;

import academy.devdojo.javaoneforall.javacore.zzbbehaviour.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviourPerParameterTest01 {
    private static List<Car> cars = List.of(new Car("black", 2020), new Car("red", 2019), new Car("blue", 1998));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "blue"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("======================================");
        System.out.println(filterByYearBefore(cars, 2020));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
