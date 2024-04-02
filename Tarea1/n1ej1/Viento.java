package Tarea1.n1ej1;

public class Viento extends Instrumento {
    public Viento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    void tocar() {
        System.out.println("Se escucha un instrumento de viento");
    }

    }

