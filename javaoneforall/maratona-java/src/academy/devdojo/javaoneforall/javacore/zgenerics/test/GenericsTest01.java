package academy.devdojo.javaoneforall.javacore.zgenerics.test;

import academy.devdojo.javaoneforall.javacore.ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure

        List list = new ArrayList();
        list.add(1L);
        list.add("Spike Spiegel");
        list.add(new Manga(1L, "Vinland Saga", 19.99));

        for(Object o : list){
            if (o instanceof String){
                System.out.println(o);
            }
            if (o instanceof Manga){
                System.out.println(o);
            }
            if (o instanceof Long){
                System.out.println(o);
            }

        }
    }
}
