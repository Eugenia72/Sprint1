package Tarea1.n3ej1;

public class Basquet extends Noticia {
    private String competencia;
    private String club;

    public Basquet(String titular, String texto, int puntuacion, double precio, String competencia, String club) {
        super(titular, texto, puntuacion, precio);
        this.competencia = competencia;
        this.club = club;
    }

    public String getCompetencia() {
        return competencia;
    }

    public String getClub() {
        return club;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public void setClub(String club) {
        this.club = club;
    }



  @Override
	public double calcularPrecioNoticia() {
		super.setPrecio(250);

		if(this.getCompetencia().equalsIgnoreCase("Euroliga")) {
			super.setPrecio(super.getPrecio() + 75);
		}

		if(this.getClub().equalsIgnoreCase("Barça") || this.getClub().equalsIgnoreCase("Madrid")) {
			super.setPrecio(super.getPrecio() + 75);
		}

		return super.getPrecio();
	}

	@Override
	public int calcularPuntuacion() {
		super.setPuntuacion(4);

		if(this.getCompetencia().equalsIgnoreCase("Euroliga")) {
			super.setPuntuacion(super.getPuntuacion() + 3);
		}
		if(this.getCompetencia().equalsIgnoreCase("ACB")) {
			super.setPuntuacion(super.getPuntuacion() + 2);
		}
		if(this.getClub().equalsIgnoreCase("Barça") || this.getClub().equalsIgnoreCase("Madrid")) {
			super.setPuntuacion(super.getPuntuacion() + 1);
		}

		return super.getPuntuacion();
	}
}

