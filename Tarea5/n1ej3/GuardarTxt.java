package Tarea5.n1ej3;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;

public class GuardarTxt {
    private String rutaArchivo;
    private String contenido;

    public GuardarTxt(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public GuardarTxt(String rutaArchivo, String contenido) {
        this.rutaArchivo = rutaArchivo;
        this.contenido = contenido;
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

    public void listarDirectorioCompleto(String rutaArchivo) {
        File file = new File(rutaArchivo);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("listado.txt"));
            imprimirDirectorio(file, writer);
            writer.close();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void crearArchivodeResultado(String rutaArchivo) {
        try (FileWriter fileWriter = new FileWriter("listado.txt"); BufferedWriter writer = new BufferedWriter(fileWriter)){
            File file = new File(rutaArchivo);
            imprimirDirectorio(file, writer);
        } catch (IOException e) {
            System.out.println("Error al abrir o escribir en el archivo: " + e.getMessage());
        }
    }}




