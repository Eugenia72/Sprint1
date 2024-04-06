package n2ej1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Restaurante> restaurantes = new HashSet<>();

        Restaurante restorante1 = new Restaurante("Pizza Lola", 9);
        Restaurante restorante2 = new Restaurante("La Fonda", 5);
        Restaurante restorante3 = new Restaurante("Pizza Lola", 9);
        Restaurante restorante4 = new Restaurante("La Fonda", 7);
        Restaurante restorante5 = new Restaurante("Floresteca", 8);

        restaurantes.add(restorante1);
        restaurantes.add(restorante2);
        restaurantes.add(restorante3);
        restaurantes.add(restorante4);
        restaurantes.add(restorante5);


        for (Restaurante restaurante : restaurantes) {
            System.out.println("Nombre: " + restaurante.getNombre() + ", Puntuación: " + restaurante.getPuntuacion());
        }
    }
}
