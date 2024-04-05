package Tarea8.n1ej6;


import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Object> lista = Arrays.asList("Nora", 3, "deportes", "amor", "mundo", 9, 7);

        System.out.println("Lista original: " + lista);
        lista.sort((a, b) -> a.toString().length() - b.toString().length());//se invierte el orden
        System.out.println("Lista ordenada: " + lista);
    }
}


