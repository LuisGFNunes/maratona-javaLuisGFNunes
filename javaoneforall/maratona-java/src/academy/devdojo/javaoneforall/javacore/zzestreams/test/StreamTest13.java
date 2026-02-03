package academy.devdojo.javaoneforall.javacore.zzestreams.test;

import academy.devdojo.javaoneforall.javacore.zzestreams.domain.Category;
import academy.devdojo.javaoneforall.javacore.zzestreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.zzestreams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static academy.devdojo.javaoneforall.javacore.zzestreams.domain.Promotion.*;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(groupingBy(StreamTest13::getPromotion));

        System.out.println(collect);

        // Map<Category,  Map<Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, groupingBy(StreamTest13::getPromotion)));

        System.out.println(collect1);

    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }


}

