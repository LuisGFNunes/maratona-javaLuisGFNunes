package academy.devdojo.javaoneforall.javacore.zgenerics.test;

import academy.devdojo.javaoneforall.javacore.zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.zgenerics.service.RentableCarService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        RentableCarService rentableCarService = new RentableCarService();
        Car car = rentableCarService.searchAvailableCar();
        System.out.println("Using car for a month...");
        rentableCarService.returnAvailableCar(car);
    }
}
