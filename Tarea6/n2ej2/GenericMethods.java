package Tarea6.n2ej2;

public class GenericMethods {

    public static <T> void metodoGenerico(T... argumentos) {
        for (T argumento : argumentos) {
            System.out.println(argumento);
        }
    }
}
