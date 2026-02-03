package academy.devdojo.javaoneforall.javacore.ycollections.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private Double price;
    private int quantity;

    public Manga(Long id, String name, Double price) {
        Objects.requireNonNull(id, "id is null");
        Objects.requireNonNull(name, "name is null");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Manga(Long id, String name, Double price, int quantity) {
        this(id, name, price);
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(name, manga.name) && Objects.equals(price, manga.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Manga[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ']';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Manga otherManga) {
        // negative if this < otherManga
        // if this == otherManga, return 0
        // positive if this > otherManga

        // if (this.id < otherManga.getId()) return -1;
        // else if (this.id.equals(otherManga.getId())) return 0;
        // else return 1;

        return this.name.compareTo(otherManga.getName());


    }
}
