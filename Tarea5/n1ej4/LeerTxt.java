package Tarea5.n1ej4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class LeerTxt {
    private String rutaArchivo;

    public LeerTxt(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }


    public void imprimirDirectorio(File file, BufferedWriter writer) throws IOException {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        if (file.isDirectory()) {
            writer.write("D: " + file.getName() + " Fecha de última modificación: " + formatoFecha.format(file.lastModified()));
            writer.newLine();
            File[] listaContenido = file.listFiles();
            if (listaContenido != null) {
                Arrays.sort(listaContenido);
                for (File contenido : listaContenido) {
                    imprimirDirectorio(contenido, writer);
                }
            }
        } else if (file.isFile()) {
            writer.write("F: " + file.getName() + " Fecha de última modificación: " + formatoFecha.format(file.lastModified()));
            writer.newLine();
        } else {
            writer.write("No es ni un fichero ni un directorio.");
            writer.newLine();
        }
    }


    public void listarYCrearArchivo(String rutaArchivo) {
        try {
            File file = new File(rutaArchivo);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("listado.txt"))) {
                imprimirDirectorio(file, writer);
            }
        } catch (IOException e) {
            System.out.println("Error al manejar la operación en el archivo: " + e.getMessage());
        }
    }


        public void imprimirContenidoArchivo (String rutaArchivo){
            try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        }


    }



