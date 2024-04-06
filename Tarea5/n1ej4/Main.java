package Tarea5.n1ej4;

import Tarea5.n1ej3.GuardarTxt;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo: ");
        String rutaArchivo = input.nextLine();

        // Crear una instancia de la clase LeerTxt
        LeerTxt lector = new LeerTxt(rutaArchivo);
        lector.listarYCrearArchivo(rutaArchivo);
        lector.imprimirContenidoArchivo(rutaArchivo);


        System.out.println("Archivo de listado leido exitosamente.");
    }
}