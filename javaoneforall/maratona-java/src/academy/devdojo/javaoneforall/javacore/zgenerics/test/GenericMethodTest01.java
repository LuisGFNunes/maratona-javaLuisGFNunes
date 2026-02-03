package academy.devdojo.javaoneforall.javacore.zgenerics.test;

import academy.devdojo.javaoneforall.javacore.zgenerics.domain.Boat;

import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        List<Boat> boatList = printArray(new Boat("Yatch"));
        System.out.println(boatList);
    }

    private static <T> List<T> printArray(T t) {
            return List.of(t);
    }

//    private static <T extends Comparable<T>> List<T> printArray(T t) {
//        return List.of(t);
//    }
}
