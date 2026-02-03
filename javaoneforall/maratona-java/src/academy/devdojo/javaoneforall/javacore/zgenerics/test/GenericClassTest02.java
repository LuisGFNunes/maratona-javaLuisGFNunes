package academy.devdojo.javaoneforall.javacore.zgenerics.test;

import academy.devdojo.javaoneforall.javacore.zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.zgenerics.service.RentableBoatService;
import academy.devdojo.javaoneforall.javacore.zgenerics.service.RentableCarService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        RentableBoatService rentableBoatService = new RentableBoatService();
        Boat boat = rentableBoatService.searchAvailableBoat();
        System.out.println("Using boat for a month...");
        rentableBoatService.returnAvailableBoat(boat);
    }
}
