package academy.devdojo.javaoneforall.javacore.ycollections.test;

import academy.devdojo.javaoneforall.javacore.ycollections.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Vinland Saga", 19.99, 10));
        mangas.add(new Manga(1L, "Cowboy Bebop", 21.99, 0));
        mangas.add(new Manga(9L, "Evangelion", 14.99, 5));
        mangas.add(new Manga(4L, "Spy x Family", 24.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
