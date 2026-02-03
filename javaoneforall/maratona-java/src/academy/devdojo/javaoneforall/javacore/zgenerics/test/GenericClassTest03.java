package academy.devdojo.javaoneforall.javacore.zgenerics.test;

import academy.devdojo.javaoneforall.javacore.zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.zgenerics.service.RentableBoatService;
import academy.devdojo.javaoneforall.javacore.zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Ford"), new Car("Mercedes")));
        List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Yacht"), new Boat("SpeedBoat"), new Boat("JetSki")));

        RentalService<Car> rentalService = new RentalService<>(availableCars);
        Car car = rentalService.searchAvailableObject();
        System.out.println("Using a car for a month...");
        rentalService.returnAvailableObject(car);

        System.out.println("------------------------------");

        RentalService<Boat> rentalService2 = new RentalService<>(availableBoats);
        Boat boat = rentalService2.searchAvailableObject();
        System.out.println("Using a boat for a month...");
        rentalService2.returnAvailableObject(boat);


    }
}
