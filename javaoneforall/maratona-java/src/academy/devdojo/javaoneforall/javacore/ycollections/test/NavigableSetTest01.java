package academy.devdojo.javaoneforall.javacore.ycollections.test;

import academy.devdojo.javaoneforall.javacore.ycollections.domain.Manga;
import academy.devdojo.javaoneforall.javacore.ycollections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone s1, Smartphone s2) {
        return s1.getBrand().compareTo(s2.getBrand());
    }
}

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga m1, Manga m2) {
        return m1.getPrice().compareTo(m2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("1155", "Nokia");
        set.add(smartphone);

//        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(5L, "Vinland Saga", 19.99, 10));
        mangas.add(new Manga(1L, "Cowboy Bebop", 21.99, 0));
        mangas.add(new Manga(9L, "Evangelion", 14.99, 5));
        mangas.add(new Manga(4L, "Spy x Family", 24.99, 3));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga kaguyaSama =  new Manga(7L, "Kaguya-Sama: Love is War", 19.99, 4);

//        lower <, floor <=, higher >, ceiling >=
        System.out.println("-------------------------------------");
        System.out.println(mangas.lower(kaguyaSama));
        System.out.println(mangas.floor(kaguyaSama));
        System.out.println(mangas.higher(kaguyaSama));
        System.out.println(mangas.ceiling(kaguyaSama));
    }
}
