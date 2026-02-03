package academy.devdojo.javaoneforall.javacore.zzainnerclasses.test;

import academy.devdojo.javaoneforall.javacore.zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BoatNameComparator implements Comparator<Boat> {
    @Override
    public int compare(Boat o1, Boat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> boats = new ArrayList<>(List.of(new Boat("Yatch"), new Boat("JetSki")));

        boats.sort(Comparator.comparing(Boat::getName)); // lambdas
        boats.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); // lambdas

        boats.sort(new Comparator<Boat>() {  // anonymous class
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(boats);
    }
}
