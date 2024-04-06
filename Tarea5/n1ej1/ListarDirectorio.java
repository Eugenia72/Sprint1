package Tarea5.n1ej1;

import java.io.*;
import java.util.Arrays;


public class ListarDirectorio {

    private String rutaArchivo; //  atributo para almacenar la ruta del directorio
    public static void imprimirDirectorio(File file) {
        String[] listaContenido = file.list();
        if (listaContenido != null) {
            Arrays.sort(listaContenido);
            for (int i = 0; i < listaContenido.length; i++) {
                System.out.println(listaContenido[i]);
            }
        } else {
            System.out.println("La ruta es nula");
        }
    } }




