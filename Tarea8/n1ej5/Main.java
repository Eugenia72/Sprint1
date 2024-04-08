package Tarea8.n1ej5;


public class Main {
    public static void main(String[] args) {
        // Instanciar la interfaz
        Functional_Interface pi = () -> 3.1415;

        // Invoco el método getPiValue() 
        System.out.println("El valor de Pi es: " + pi.getPiValue());
    }
}
