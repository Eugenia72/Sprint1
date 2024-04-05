package Tarea6.n1ej2;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Anita", "Paredes", 56);

        System.out.println(persona.toString());
        GenericMethods generico = new GenericMethods();
        generico.metodoGenerico(persona, 55,1972);


        GenericMethods.metodoGenerico(new Persona("Juanita", "Plaza", 5),"días",60);
    }

}