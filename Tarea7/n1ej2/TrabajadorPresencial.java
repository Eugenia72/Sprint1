package Tarea7.n1ej2;

public class TrabajadorPresencial extends Trabajador {
    private static double gasolina = 10.50;

    public TrabajadorPresencial(String nombre, String apellido, double precioHora, double gasolina) {
        super(nombre, apellido, precioHora);
        this.gasolina = gasolina;
    }

    public static double getGasolina() {

        return gasolina;
    }

    public static void setGasolina(double gasolina) {

        TrabajadorPresencial.gasolina = gasolina;
    }

    @Override
    public double calcularSueldo(double horasTrabajadasMes) {
        double sueldo = (horasTrabajadasMes * precioHora) + gasolina;
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " y la gasolina tiene un precio de " + gasolina + "€";
    }

    @Deprecated
    public void metodoDeprecated(){
        System.out.println("Método obsoleto");
    }
    }

