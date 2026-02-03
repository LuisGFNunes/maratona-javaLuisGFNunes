package academy.devdojo.javaoneforall.javacore.ycollections.test;

import academy.devdojo.javaoneforall.javacore.ycollections.domain.Consumer;
import academy.devdojo.javaoneforall.javacore.ycollections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("William");
        Consumer consumer2 = new Consumer("Harry");

        Manga vinlandSaga = new Manga(5L, "Vinland Saga", 19.99);
        Manga cowboyBebop = new Manga(1L, "Cowboy Bebop", 21.99);
        Manga evangelion = new Manga(9L, "Evangelion", 14.99);
        Manga spyXFamily = new Manga(4L, "Spy x Family", 24.99);

        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, vinlandSaga);
        consumerMangaMap.put(consumer2, cowboyBebop);

        for (Map.Entry<Consumer, Manga> entry: consumerMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }

    }
}
