package Tarea1.n3ej1;

public class Futbol extends Noticia {
    private String competencia;
    private String club;
    private String jugador;

    public Futbol(String titular, String texto, int puntuacion, double precio, String competencia, String club, String jugador) {
        super(titular, texto, puntuacion, precio);
        this.competencia = competencia;
        this.club = club;
        this.jugador = jugador;
    }

    public String getCompetencia() {
        return competencia;
    }

    public String getClub() {
        return club;
    }

    public String getJugador() {
        return jugador;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    @Override
    public double calcularPrecioNoticia() {
        super.setPrecio(300);

        if (this.getCompetencia().equalsIgnoreCase("Liga de Campeones")) {
            super.setPrecio(super.getPrecio() + 100);
        }

        if (this.getClub().equalsIgnoreCase("Barça") || this.getClub().equalsIgnoreCase("Madrid")) {
            super.setPrecio(super.getPrecio() + 100);
        }

        if (this.getJugador().equalsIgnoreCase("Ferran Torres") || this.getJugador().equalsIgnoreCase("Benzema")) {
            super.setPrecio(super.getPrecio() + 50);
        }

        return super.getPrecio();
    }

    @Override
    public int calcularPuntuacion() {
        super.setPuntuacion(5);

        if (this.getCompetencia().equalsIgnoreCase("Liga de Campeones")) {
            super.setPuntuacion(super.getPuntuacion() + 3);
        }
        if (this.getCompetencia().equalsIgnoreCase("Lliga")) {
            super.setPuntuacion(super.getPuntuacion() + 2);
        }
        if (this.getClub().equalsIgnoreCase("Barça") || this.getClub().equalsIgnoreCase("Madrid")) {
            super.setPuntuacion(super.getPuntuacion() + 1);
        }
        if (this.getJugador().equalsIgnoreCase("Ferran Torres") || this.getJugador().equalsIgnoreCase("Benzema")) {
            super.setPuntuacion(super.getPuntuacion() + 1);
        }
        return super.getPuntuacion();
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getCompetencia() + " " + this.getClub() + " " + this.getJugador();
    }
}
