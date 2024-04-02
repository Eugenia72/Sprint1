package Tarea1.n1ej1;

public class Percusion extends Instrumento {

    public Percusion(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Se escucha un instrumento de percusion");

    }
}
