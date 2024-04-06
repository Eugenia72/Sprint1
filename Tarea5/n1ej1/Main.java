package Tarea5.n1ej1;
import java.io.File;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hola, introduce la ruta del directorio:");
        String rutaArchivo = input.nextLine();
        File file = new File(rutaArchivo);
        ListarDirectorio.imprimirDirectorio(file);

    }
}
