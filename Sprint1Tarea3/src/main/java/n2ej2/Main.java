package n2ej2;


import java.util.*;

public class Main {


    public static void main(String[] args) {

        Set<Restaurante> restauranteSet = new HashSet<Restaurante>();

        Restaurante restorante1 = new Restaurante("Pizza Lola", 9);
        Restaurante restorante2 = new Restaurante("La Fonda", 5);
        Restaurante restorante3 = new Restaurante("Pizza Lola", 8);
        Restaurante restorante4 = new Restaurante("La Fonda", 7);
        Restaurante restorante5 = new Restaurante("Floresteca", 8);

        restauranteSet.add(restorante1);
        restauranteSet.add(restorante2);
        restauranteSet.add(restorante3);
        restauranteSet.add(restorante4);
        restauranteSet.add(restorante5);


        List<Restaurante> listaOrdenada = new ArrayList<>(restauranteSet);
        Collections.sort(listaOrdenada);

        System.out.println("Lista de restaurantes ordenada :");
        for (Restaurante restaurante : listaOrdenada) {
            System.out.println("Nombre: " + restaurante.getNombre() + ", Puntuación: " + restaurante.getPuntuacion());
        }
    }
}

