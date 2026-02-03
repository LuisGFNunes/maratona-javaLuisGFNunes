package academy.devdojo.javaoneforall.javacore.zzclambdas.test;

import academy.devdojo.javaoneforall.javacore.zzclambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.zzclambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Apothecary Diaries", 48), new Anime("Vinland Saga", 24), new Anime("Cowboy Bebop", 24)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);

    }
}
