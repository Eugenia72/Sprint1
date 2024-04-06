package n2ej2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Restaurante> restaurantes = new ArrayList<>();

        restaurantes.add(new Restaurante("Pizza Lola", 9));
        restaurantes.add(new Restaurante("Floresteca", 7));
        restaurantes.add(new Restaurante("Pizza Lola ", 8));
        restaurantes.add(new Restaurante("Braseria Pepe", 5));
        restaurantes.add(new Restaurante("Floresteca", 3));



        System.out.println("Lista de restaurantes sin ordenar :");
        for (Restaurante restaurante : restaurantes) {
            System.out.println("Nombre: " + restaurante.getNombre() + ", Puntuación: " + restaurante.getPuntuacion());
        }

        Collections.sort(restaurantes);

        System.out.println("Lista de restaurantes ordenada :");
        for (Restaurante restaurante : restaurantes) {
            System.out.println("Nombre: " + restaurante.getNombre() + ", Puntuación: " + restaurante.getPuntuacion());
        }
    }
}
