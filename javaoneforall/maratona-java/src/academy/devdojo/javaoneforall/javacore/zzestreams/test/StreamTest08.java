package academy.devdojo.javaoneforall.javacore.zzestreams.test;

import academy.devdojo.javaoneforall.javacore.zzestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 5)
                .reduce(Double::sum).ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 5)
                .sum();
        System.out.println(sum);
    }
}
