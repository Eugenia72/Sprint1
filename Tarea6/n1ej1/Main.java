package Tarea6.n1ej1;

public class Main {

    public static void main(String[] args) {

        // Inicializar los títulos en cualquier posición
        NoGenericMethods noGenericMethods1 = new NoGenericMethods("Buenos dias", "Llueve", "Mucho");
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("Llueve", "Buenos dias", "Mucho");
        NoGenericMethods noGenericMethods3 = new NoGenericMethods("Mucho", "Llueve", "Buenos dias");

        // Acceder a los títulos
        String titulo1_1 = noGenericMethods1.getTitulo1();
        String titulo2_2 = noGenericMethods2.getTitulo2();
        String titulo3_3 = noGenericMethods3.getTitulo3();


        System.out.println(noGenericMethods1);
        System.out.println(noGenericMethods2);
        System.out.println(noGenericMethods3);
    }
}






