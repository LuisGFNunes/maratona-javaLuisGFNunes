package academy.devdojo.javaoneforall.javacore.zzestreams.test;

import academy.devdojo.javaoneforall.javacore.zzestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 5.99) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
