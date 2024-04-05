package Tarea7.n1ej2;

public class Main {


    public static void main(String[] args) {

        @SuppressWarnings("deprecation")
        TrabajadorPresencial trabajadorPresencial1 = new TrabajadorPresencial("Erika", "Montoya", 20, 150);
        trabajadorPresencial1.metodoDeprecated();
        TrabajadorOnline trabajadorOnline1 = new TrabajadorOnline("Eugenia", "Torres", 15);
        trabajadorOnline1.metodoDeprecated();
        System.out.println(trabajadorOnline1.toString());
        System.out.println(trabajadorPresencial1.toString());

    }
}
