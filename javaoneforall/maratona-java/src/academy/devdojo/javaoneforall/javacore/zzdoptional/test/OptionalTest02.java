package academy.devdojo.javaoneforall.javacore.zzdoptional.test;

import academy.devdojo.javaoneforall.javacore.zzdoptional.domain.Manga;
import academy.devdojo.javaoneforall.javacore.zzdoptional.repository.MangaRepository;

public class OptionalTest02 {
    public static void main(String[] args) {
        MangaRepository.findByTitle("Vinland Saga")
                .ifPresent(m -> m.setTitle("Vinland Saga II"));


        Manga mangaById = MangaRepository.findById(3).orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Cowboy Bebop").orElse(new Manga(4, "Cowboy Bebop", 24));
        System.out.println(newManga);
    }
}
