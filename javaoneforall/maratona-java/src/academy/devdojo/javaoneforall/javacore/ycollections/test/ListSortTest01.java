package academy.devdojo.javaoneforall.javacore.ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Vinland Saga");
        mangas.add("Berserk");
        mangas.add("Vagabond");
        mangas.add("Dragon Ball Z");
        
        Collections.sort(mangas);

        List<Double> mangaPrices = new ArrayList<>();
        mangaPrices.add(19.99);
        mangaPrices.add(9D);
        mangaPrices.add(14.99);
        mangaPrices.add(29.99);

        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-------------------");
        System.out.println(mangaPrices);
    }
}
