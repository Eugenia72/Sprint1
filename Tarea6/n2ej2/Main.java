package Tarea6.n2ej2;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Pérez", 25);
        Persona persona2 = new Persona("Ana", "García", 30);
        Persona persona3 = new Persona("Luis", "Sanchez", 35);

        GenericMethods.metodoGenerico(23, new Persona("Ana", "García", 30));
        GenericMethods.metodoGenerico("Tostadas con queso", "Sandwiches", 20);
    }
}
