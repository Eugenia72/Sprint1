package Tarea1.n3ej1;

public class Tenis extends Noticia {


    private String competencia;
    private String tenistas;

    public Tenis(String titular, String texto, int puntuacion, double precio, String competencia, String tenistes) {
        super(titular, texto, puntuacion, precio);
        this.competencia = competencia;
        this.tenistas = tenistas;
    }

    public String getCompetencia() {
        return competencia;
    }

    public String getTenistas() {
        return tenistas;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public void setTenistas(String tenistas) {
        this.tenistas = tenistas;
    }

    @Override
    public double calcularPrecioNoticia() {
        super.setPrecio(150);

        if (this.getTenistas().equalsIgnoreCase("Federer") || this.getTenistas().equalsIgnoreCase("Nadal")
                || this.getTenistas().equalsIgnoreCase("Djokovic")) {
            super.setPrecio(super.getPrecio() + 100);
        }
        return super.getPrecio();
    }

    @Override
    public int calcularPuntuacion() {
        super.setPuntuacion(4);

        if (this.getTenistas().equalsIgnoreCase("Federer") || this.getTenistas().equalsIgnoreCase("Nadal")
                || this.getTenistas().equalsIgnoreCase("Djokovic")) {
            super.setPuntuacion(super.getPuntuacion() + 3);
        }
        return super.getPuntuacion();

    }

}
