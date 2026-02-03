package academy.devdojo.javaoneforall.javacore.zzestreams.test;

import academy.devdojo.javaoneforall.javacore.zzestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Re:Zero", 4.99),
            new LightNovel("Violet Evergarden", 6.99),
            new LightNovel("Spy X Family", 5.99),
            new LightNovel("Cowboy Bebop", 4.99),
            new LightNovel("Jujutsu Kaisen", 8.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kaguya-Sama: Love is War", 7.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));

        lightNovels.stream().filter(ln -> ln.getPrice() > 5).findAny().ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
