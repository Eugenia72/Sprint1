package Tarea1.n2ej1;

public class Telefono {

    private String marca;
    private String modelo;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void llamar(String numero) {
        System.out.println("Está llamando al número " + numero);
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
