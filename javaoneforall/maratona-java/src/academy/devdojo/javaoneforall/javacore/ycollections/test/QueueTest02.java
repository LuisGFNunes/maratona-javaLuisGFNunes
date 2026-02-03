package academy.devdojo.javaoneforall.javacore.ycollections.test;

import academy.devdojo.javaoneforall.javacore.ycollections.domain.Consumer;
import academy.devdojo.javaoneforall.javacore.ycollections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());
        mangas.add(new Manga(5L, "Vinland Saga", 19.99));
        mangas.add(new Manga(1L, "Cowboy Bebop", 21.99));
        mangas.add(new Manga(9L, "Evangelion", 14.99));
        mangas.add(new Manga(4L, "Spy x Family", 24.99));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }

    }
}
