package academy.devdojo.javaoneforall.javacore.zzestreams.test;

import academy.devdojo.javaoneforall.javacore.zzestreams.domain.Category;
import academy.devdojo.javaoneforall.javacore.zzestreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Re:Zero", 4.99, Category.SEINEN),
            new LightNovel("Violet Evergarden", 6.99, Category.SEINEN),
            new LightNovel("Spy X Family", 5.99, Category.SHONEN),
            new LightNovel("Cowboy Bebop", 4.99, Category.SEINEN),
            new LightNovel("Jujutsu Kaisen", 8.99, Category.SHONEN),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.SHONEN),
            new LightNovel("Kaguya-Sama: Love is War", 7.99, Category.SEINEN)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> seinen = new ArrayList<>();
        List<LightNovel> shonen = new ArrayList<>();
        List<LightNovel> shojo = new ArrayList<>();
        List<LightNovel> josei = new ArrayList<>();
        List<LightNovel> kodomo = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case SEINEN: seinen.add(lightNovel); break;
                case SHONEN: shonen.add(lightNovel); break;
                case SHOJO: shojo.add(lightNovel); break;
                case JOSEI: josei.add(lightNovel);  break;
                case KODOMO: kodomo.add(lightNovel);
            }
        }

        categoryLightNovelMap.put(Category.SEINEN, seinen);
        categoryLightNovelMap.put(Category.SHONEN, shonen);
        categoryLightNovelMap.put(Category.SHOJO, shojo);
        categoryLightNovelMap.put(Category.JOSEI, josei);
        categoryLightNovelMap.put(Category.KODOMO, kodomo);

        System.out.println(categoryLightNovelMap);

// ==== com streams ==== grouping by ========== ============================== ================
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
