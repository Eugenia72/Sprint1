package Tarea8.n1ej1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("reinado", "amanecer", "Mundano", "Tortuga", "solo");


        List<String> palabrasConO = filtrarPalabrasConO(palabras); // llamada al método filtrar

        // Imprimir el resultado
        System.out.println("Cadenas que contienen la letra 'o': " + palabrasConO);
    }


    public static List<String> filtrarPalabrasConO(List<String> palabras) {
        return palabras.stream()
                .filter(string -> string.toLowerCase().contains("o"))

                .collect(Collectors.toList()); // almacena elementos
    }
}


