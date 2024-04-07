package n2ej1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Restaurante> restauranteSet = new HashSet<Restaurante>();

        Restaurante restorante1 = new Restaurante("Pizza Lola", 9);
        Restaurante restorante2 = new Restaurante("La Fonda", 5);
        Restaurante restorante3 = new Restaurante("Pizza Lola", 9);
        Restaurante restorante4 = new Restaurante("La Fonda", 7);
        Restaurante restorante5 = new Restaurante("Floresteca", 8);

        restauranteSet.add(restorante1);
        restauranteSet.add(restorante2);
        restauranteSet.add(restorante3);
        restauranteSet.add(restorante4);
        restauranteSet.add(restorante5);


        for (Restaurante restaurante : restauranteSet) {
            System.out.println("Nombre: " + restaurante.getNombre() + ", Puntuación: " + restaurante.getPuntuacion());
        }
    }
}
