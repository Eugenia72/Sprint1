package Tarea5.n1ej3;

import java.io.File;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor introduce la ruta del archivo:");
        String rutaArchivo = input.nextLine();

        GuardarTxt guardarTxt = new GuardarTxt(rutaArchivo);
        guardarTxt.crearArchivodeResultado(rutaArchivo);

        System.out.println("Resultados guardados en listado.txt");

        input.close();
    }
}

