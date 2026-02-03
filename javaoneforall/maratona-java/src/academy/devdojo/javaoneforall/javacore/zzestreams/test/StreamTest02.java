package academy.devdojo.javaoneforall.javacore.zzestreams.test;

import academy.devdojo.javaoneforall.javacore.zzestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
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
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 5.99)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);


    }
}
