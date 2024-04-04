package n1ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<Integer>();
        lista1.add(7);
        lista1.add(6);
        lista1.add(5);
        lista1.add(4);
        lista1.add(3);

        List<Integer> lista2 = new ArrayList<Integer>();
        ListIterator<Integer> it = lista1.listIterator(lista1.size());

        while (it.hasPrevious()) {

            lista2.add(it.previous());
        }

        for (Integer n : lista2) {

            System.out.println(n);
        }
    }
}