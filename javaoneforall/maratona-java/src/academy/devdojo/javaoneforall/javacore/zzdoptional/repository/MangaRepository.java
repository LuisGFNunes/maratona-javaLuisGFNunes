package academy.devdojo.javaoneforall.javacore.zzdoptional.repository;

import academy.devdojo.javaoneforall.javacore.zzdoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> allMangas = List.of(new Manga(1, "Vinland Saga", 128), new Manga(2, "Berserk", 210), new Manga(3, "Evangelion", 120));

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : allMangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}