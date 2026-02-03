package academy.devdojo.javaoneforall.javacore.ycollections.test;

import academy.devdojo.javaoneforall.javacore.ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {

    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Vinland Saga", 19.99));
        mangas.add(new Manga(1L, "Cowboy Bebop", 21.99));
        mangas.add(new Manga(9L, "Evangelion", 14.99));
        mangas.add(new Manga(4L, "Spy x Family", 24.99));

        System.out.println("\nNot Ordered List:");
        for (Manga manga : mangas) {
            System.out.println("\t" + manga);
        }

        System.out.println("======================================================");

        System.out.println("\nOrdered List:");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println("\t" + manga);
        }

        System.out.println("=====================================================");


//      Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println("\t" + manga);
        }

    }
}
