package academy.devdojo.javaoneforall.javacore.zzestreams.test;

import academy.devdojo.javaoneforall.javacore.zzestreams.domain.Category;
import academy.devdojo.javaoneforall.javacore.zzestreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.zzestreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static academy.devdojo.javaoneforall.javacore.zzestreams.domain.Promotion.*;
import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);


        // Map<Category, List<Promotion>>
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
