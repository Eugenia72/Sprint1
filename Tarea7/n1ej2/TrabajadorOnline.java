package Tarea7.n1ej2;

public class TrabajadorOnline extends Trabajador {
    private static final double TARIFA_PLANA = 25.50;

    public TrabajadorOnline(String nombre, String apellido, double precioHora) {

        super(nombre, apellido, precioHora);
    }

    public static double getTARIFA_PLANA() {
        return TARIFA_PLANA;
    }

    @Override
    public double calcularSueldo(double horasTrabajadasMes) {
        double sueldoMes = (horasTrabajadasMes * precioHora) + TARIFA_PLANA;
        return sueldoMes;
    }

    @Override
    public String toString() {
        return super.toString() + " y la tarifa plana le ha costado " + TARIFA_PLANA + "€";
    }

    @Deprecated
    public void metodoDeprecated() {
        System.out.println("Es un método obsoleto");
    }
}




