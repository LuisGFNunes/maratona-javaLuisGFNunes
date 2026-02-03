package academy.devdojo.javaoneforall.javacore.zzclambdas.test;

import academy.devdojo.javaoneforall.javacore.zzclambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.zzclambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new; // o object não é instanciado aqui;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("FullMetal Alchemist", 68), new Anime( "Frieren", 32 ), new Anime("Shigatsu Wa Kimi no Uso", 24)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes)  -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunctionII = Anime::new;
        System.out.println(animeBiFunctionII.apply("Cowboy Bebop", 24));
    }
}
