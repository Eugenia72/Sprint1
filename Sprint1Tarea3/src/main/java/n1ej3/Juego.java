package n1ej3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Juego {
    private Scanner input = new Scanner(System.in);
    private String nombreJugador;
    private String capital;
    private String respuesta;
    private int puntaje;
    private HashMap<String, String> paises = new HashMap<>();


    public void empezarJuego() {


        HashMap<String, String> paises = leerArchivo();

        System.out.println("Ingresa tu nombre para comenzar el juego");
        nombreJugador = input.nextLine();

        puntaje = 0;
        List<String> listaPaises = new ArrayList<>(paises.keySet());


        for (int i = 0; i < 10; i++) {
            int indiceRandom = (int) (Math.random() * listaPaises.size());
            String pais = listaPaises.get(indiceRandom);
            System.out.println("¿Cuál es la capital de " + pais + "?");
            respuesta = input.nextLine();
            if (respuesta.equalsIgnoreCase(paises.get(pais))) {
                puntaje++;
            } else {
                System.out.println("Respuesta incorrecta");
            }
            listaPaises.remove(indiceRandom); // Elimina el país de la lista
        }

        System.out.println("Tu puntaje es " + puntaje);
        generarArchivo(nombreJugador, puntaje);
    }

   public HashMap<String, String> leerArchivo() {
        HashMap<String, String> paises = new HashMap<>();
        try (FileReader fr = new FileReader("src/main/java/n1ej3/Countries.txt");
             BufferedReader bf = new BufferedReader(fr)) {
            String linea;
            while ((linea = bf.readLine()) != null) {
                String[] partesLinea = linea.split(" ");
                if (partesLinea.length == 2) {
                    String pais = partesLinea[0].trim();
                    String capital = partesLinea[1].trim();
                    paises.put(pais, capital);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en lectura de archivo");
        }
        return paises;
    }

   public void generarArchivo(String nombreJugador, int puntaje) {
        try (FileWriter escritor = new FileWriter("src/main/java/n1ej3/Clasificación.txt", true);
             BufferedWriter bw = new BufferedWriter(escritor)) {
            bw.write(nombreJugador + " " + puntaje + "\n");
        } catch (IOException e) {
            System.out.println("Error escribiendo el archivo");
        }
    }
}

