package academy.devdojo.javaoneforall.javacore.ycollections.test;

import academy.devdojo.javaoneforall.javacore.ycollections.domain.Consumer;
import academy.devdojo.javaoneforall.javacore.ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("William");
        Consumer consumer2 = new Consumer("Harry");

        Manga vinlandSaga = new Manga(5L, "Vinland Saga", 19.99);
        Manga cowboyBebop = new Manga(1L, "Cowboy Bebop", 21.99);
        Manga evangelion = new Manga(9L, "Evangelion", 14.99);
        Manga spyXFamily = new Manga(4L, "Spy x Family", 24.99);

        List<Manga> mangasConsumer1List = List.of(vinlandSaga, evangelion, spyXFamily);
        List<Manga> mangasConsumer2List = List.of(spyXFamily, cowboyBebop);
        Map<Consumer, List<Manga>> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, mangasConsumer1List);
        consumerMangaMap.put(consumer2, mangasConsumer2List);

        for(Map.Entry<Consumer, List<Manga>> entry: consumerMangaMap.entrySet()) {
            System.out.println("---" + entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("-----" + manga.getName());
            }

        }

    }
}
