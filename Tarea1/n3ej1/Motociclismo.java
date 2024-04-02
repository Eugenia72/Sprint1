package Tarea1.n3ej1;

public class Motociclismo extends Noticia {
    private String equipo;

    public Motociclismo(String titular, String texto, int puntuacion, double precio, String equipo) {
        super(titular, texto, puntuacion, precio);
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public double calcularPrecioNoticia() {
        super.setPrecio(100);

        if (this.getEquipo().equalsIgnoreCase("Honda") || this.getEquipo().equalsIgnoreCase("Yamaha")) {
            super.setPrecio(super.getPrecio() + 50);
        }
        return super.getPrecio();
    }

    @Override
    public int calcularPuntuacion() {

        super.setPuntuacion(3);

        if (this.getEquipo().equalsIgnoreCase("Honda") || this.getEquipo().equalsIgnoreCase("Yamaha")) {
            super.setPuntuacion(super.getPuntuacion() + 3);
        }
        return super.getPuntuacion();
    }
}



