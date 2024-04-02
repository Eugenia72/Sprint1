package Tarea1.n3ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Redactor> redactores = new ArrayList<Redactor>();

    public static void main(String[] args) {

        Redactor redactor1 = new Redactor("Mercedes Mila ", "42356789Q");
        redactores.add(redactor1);

        int opcion = 0;
        String dni = "", nombre = "", titular = "", competencia = "", club = "", jugador = "", tenistas = "", escuderia = "", equipo = "";
        double sueldo = 0.0, precio = 0.0;
        int puntuacion = 0;


        do {

            System.out.println("Seleccione qué opción desea realizar: "
                    + "1. Introducir redactor\n "
                    + "2. Eliminar redactor\n"
                    + "3. Introducir noticia a un redactor\n"
                    + "4.  Eliminar noticia\n"
                    + "5. Mostrar todas las noticias por redactor\n"
                    + "6. Calcular puntuación de la noticia.\n"
                    + "7. Calcular precio-noticia\n"
                    + "8. Salir");
            opcion = input.nextInt();
            input.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:

                    introducirRedactor(" ", " ");
                    break;
                case 2:
                    eliminarRedactor(redactores.get(0).getDni());
                    break;
                case 3:
                    // Lógica para introducir noticia a un redactor
                    break;
                case 4:
                    // Lógica para eliminar noticia
                    break;
                case 5:
                    // Lógica para mostrar todas las noticias por redactor
                    break;
                case 6:
                    // Lógica para calcular puntuación de la noticia
                    break;
                case 7:
                    // Lógica para calcular precio-noticia
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 8.");
            }
        } while (opcion != 8);

        input.close();
    }

    public static String introducirRedactor(String nombre, String dni) {
        String respuesta = "";
        Redactor redactor1 = new Redactor(nombre, dni);
        redactores.add(redactor1);
        respuesta = "El redactor ha sido creado correctamente.";
        return respuesta;
    }


    public static String eliminarRedactor(String dni) {

        String respuesta = " ";
        for (int i = 0; i < redactores.size(); i++) {
            if (redactores.get(i).getDni().equalsIgnoreCase(dni)) {
                redactores.remove(i);
                respuesta = "El redactor ha sido dado de baja";

            } else {
                respuesta = "El redactor no consta en nuestro sistema";
            }
        }
        return respuesta;
    }


}

