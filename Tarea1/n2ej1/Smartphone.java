package Tarea1.n2ej1;

public class Smartphone extends Telefono implements Reloj, Camara{

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void fotografiar() {
        System.out.println("Se esta haciendo una fotografia");
    }

    @Override
    public void alarma() {
        System.out.println("Está sonando la alarma");
    }

    }


