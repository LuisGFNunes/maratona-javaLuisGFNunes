package academy.devdojo.javaoneforall.javacore.zgenerics.service;

import academy.devdojo.javaoneforall.javacore.zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentableCarService {
    private List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Ford"), new Car("Mercedes")));

    public Car searchAvailableCar() {
        System.out.println("Searching available car...");
        Car c = availableCars.remove(0);
        System.out.println("Found car: " + c);
        System.out.println("Available cars for sale:");
        System.out.println(availableCars);
        return c;
    }

    public void returnAvailableCar(Car car) {
        System.out.println("Returning car: " + car);
        availableCars.add(car);
        System.out.println("Available cars for sale:");
        System.out.println(availableCars);
    }
}
