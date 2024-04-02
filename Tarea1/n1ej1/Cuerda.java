package Tarea1.n1ej1;

public class Cuerda extends Instrumento {
    public Cuerda(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Se escucha un instrumento de cuerda");
    }


    }

