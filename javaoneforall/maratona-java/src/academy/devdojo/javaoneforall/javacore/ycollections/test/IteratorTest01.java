package academy.devdojo.javaoneforall.javacore.ycollections.test;

import academy.devdojo.javaoneforall.javacore.ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Vinland Saga", 19.99, 10));
        mangas.add(new Manga(1L, "Cowboy Bebop", 21.99, 0));
        mangas.add(new Manga(9L, "Evangelion", 14.99, 5));
        mangas.add(new Manga(4L, "Spy x Family", 24.99, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if(mangaIterator.next().getQuantity() == 0) {
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);
    }
}
