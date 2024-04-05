package Tarea7.n1ej1;



public class TrabajadorOnline extends Trabajador {
    private static final double TARIFA_PLANA = 25.50;
    public TrabajadorOnline(String nombre, String apellido, double precioHora) {

        super(nombre, apellido, precioHora);
    }



    @Override
      public double calcularSueldo(double horasTrabajadasMes){
            double sueldoMes = (horasTrabajadasMes * precioHora) + TARIFA_PLANA;
            return sueldoMes;
    }

    @Override
    public String toString() {
        return super.toString() + " y la tarifa plana le ha costado " + TARIFA_PLANA + "€";
    }
}
