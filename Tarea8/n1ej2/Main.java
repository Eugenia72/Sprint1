package Tarea8.n1ej2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("reinado", "amanecer", "Mundano", "Tortuga", "solo");


        List<String> palabrasConMasCinco = filtrarPalabrasConMasCinco(palabras); // llamada al método filtrar

        // Imprimir el resultado
        System.out.println("Cadenas que contienen la letra 'o' y más de 5 letras: " + palabrasConMasCinco);
    }


    public static List<String> filtrarPalabrasConMasCinco(List<String> palabras) {
        return palabras.stream()
                .filter(string -> string.toLowerCase().contains("o") && string.length() > 5)

                .collect(Collectors.toList()); // almacena elementos
    }
}




