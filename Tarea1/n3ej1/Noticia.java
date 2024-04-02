package Tarea1.n3ej1;

public abstract class Noticia {
private String titular;
private String texto;
private int puntuacion;
private double precio;

    public Noticia(String titular, String texto, int puntuacion, double precio) {
        this.titular = titular;
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.precio = precio;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double calcularPrecioNoticia();

    public abstract int calcularPuntuacion();

    }

/*Les notícies han de tenir un titular, un text, una puntuació i un preu. En el moment de crear-se, el text ha d’estar buit.*/