package academy.devdojo.javaoneforall.javacore.ycollections.test;

import academy.devdojo.javaoneforall.javacore.ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Vinland Saga", 19.99));
        mangas.add(new Manga(1L, "Cowboy Bebop", 21.99));
        mangas.add(new Manga(9L, "Evangelion", 14.99));
        mangas.add(new Manga(4L, "Spy x Family", 24.99));

        System.out.println("============================================");

//      Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        System.out.println("Ordered List:");
        for (Manga manga : mangas) {
            System.out.println("\t" + manga);
        }

        Manga mangaToSearch = new Manga(4L, "Spy x Family", 24.99);

        System.out.println("value: " + mangaToSearch);
        System.out.println("binary search found at the position: " + Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
