package academy.devdojo.javaoneforall.javacore.zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> availableObjects;

    public RentalService(List<T> AvailableObjects) {
        this.availableObjects = AvailableObjects;
    }

    public T searchAvailableObject() {
        System.out.println("Searching available objects...");
        T t = availableObjects.remove(0);
        System.out.println("Found object: " + t);
        System.out.println("Available objects for sale:");
        System.out.println(availableObjects);
        return t;
    }

    public void returnAvailableObject(T t) {
        System.out.println("Returning object: " + t);
        availableObjects.add(t);
        System.out.println("Available objects for sale:");
        System.out.println(availableObjects);
    }
}
