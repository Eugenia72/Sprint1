package Tarea1.n3ej1;

public class Formula1 extends Noticia {

    private String escuderia;

    public Formula1(String titular, String texto, int puntuacion, double precio, String escuderia) {
        super(titular, texto, puntuacion, precio);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public double calcularPrecioNoticia() {
        super.setPrecio(100);

        if (this.getEscuderia().equalsIgnoreCase("Ferrari") || this.getEscuderia().equalsIgnoreCase("Mercedes")) {
            super.setPrecio(super.getPrecio() + 50);
        }
        return super.getPrecio();
    }

    @Override
    public int calcularPuntuacion() {
        super.setPuntuacion(4);

        if (this.getEscuderia().equalsIgnoreCase("Ferrari") || this.getEscuderia().equalsIgnoreCase("Mercedes")) {
            super.setPuntuacion(super.getPuntuacion() + 2);
        }
        return super.getPuntuacion();
    }
}