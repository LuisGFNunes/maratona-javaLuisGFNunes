package academy.devdojo.javaoneforall.javacore.zzestreams.test;

import academy.devdojo.javaoneforall.javacore.zzestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        // Especificas
        System.out.println(lightNovels.size());
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        lightNovels.stream().mapToDouble(LightNovel::getPrice).min().ifPresent(System.out::println);
        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        lightNovels.stream().mapToDouble(LightNovel::getPrice).max().ifPresent(System.out::println);

        // Generalista
        DoubleSummaryStatistics statistics = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(statistics);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", ", "[", "]"));
        System.out.println(titles);
    }
}
