package academy.devdojo.javaoneforall.javacore.zzbbehaviour.test;

import academy.devdojo.javaoneforall.javacore.zzbbehaviour.domain.Car;
import academy.devdojo.javaoneforall.javacore.zzbbehaviour.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviourPerParameterTest02 {
    private static List<Car> cars = List.of(new Car("black", 2020), new Car("red", 2019), new Car("blue", 1998));

    public static void main(String[] args) {
//        List<Car> blueCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("blue");
//            }
//        });

        List <Car> blueCars = filter(cars, car -> car.getColor().equals("blue"));
        List <Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List <Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2020);
        System.out.println(blueCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}
