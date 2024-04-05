package Tarea6.n2ej1;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Euge", "Gonzalez", 35);
        System.out.println(persona);
        GenericMethods.metodoGenerico("Anita", "Paredes", 56);
        GenericMethods.metodoGenerico(new Persona("Juanita", "Plaza", 5), "días", 60);
    }
}

