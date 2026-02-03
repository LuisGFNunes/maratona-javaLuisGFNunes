package academy.devdojo.javaoneforall.javacore.zgenerics.service;

import academy.devdojo.javaoneforall.javacore.zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class RentableBoatService {
    private List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Yacht"), new Boat("SpeedBoat"), new Boat("JetSki")));

    public Boat searchAvailableBoat() {
        System.out.println("Searching available boat...");
        Boat b = availableBoats.remove(0);
        System.out.println("Found boat: " + b);
        System.out.println("Available boats for sale:");
        System.out.println(availableBoats);
        return b;
    }

    public void returnAvailableBoat(Boat boat) {
        System.out.println("Returning boat: " + boat);
        availableBoats.add(boat);
        System.out.println("Available boats for sale:");
        System.out.println(availableBoats);
    }
}
