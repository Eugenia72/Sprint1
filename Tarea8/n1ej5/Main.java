package Tarea8.n1ej5;
@FunctionalInterface
interface PiValue {
    double getPiValue();
}

public class Main {
    public static void main(String[] args) {
        // Instanciar la interfaz y asignarle el valor 3.1415
        PiValue pi = () -> 3.1415;

        // Invocar el método getPiValue() e imprimir el resultado
        System.out.println("El valor de Pi es: " + pi.getPiValue());
    }
}