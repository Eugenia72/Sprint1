package Tarea5.n1ej2;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la ruta del directorio:");
        String rutaArchivo = input.nextLine();

        ListarArbol arbol = new ListarArbol(rutaArchivo);
        arbol.listarDirectorioCompleto();

        input.close();
    }
}
