package academy.devdojo.javaoneforall.javacore.zzclambdas.test;

import academy.devdojo.javaoneforall.javacore.zzclambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.zzclambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Apothecary Diaries", 48), new Anime("Vinland Saga", 24), new Anime("Cowboy Bebop", 24)));
//      animelist.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle());
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);

    }
}
