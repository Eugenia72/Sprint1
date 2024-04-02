package Tarea1.n1ej2;

public class Coche {

    private static final String MARCA = "Ford";
    private static String modelo;
    private final int POTENCIA;


    public Coche(String modelo, int POTENCIA) {
        this.modelo = modelo;
        this.POTENCIA = POTENCIA;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        modelo = modelo;
    }

    public int getPOTENCIA() {
        return POTENCIA;
    }

    public static void frenar() {

        System.out.println("El vehículo está frenando");
    }


    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }
}

