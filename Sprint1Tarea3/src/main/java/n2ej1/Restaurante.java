package n2ej1;

import java.util.Objects;
public class Restaurante {

    private String nombre;
    private int puntuacion;

    public Restaurante(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante restaurante = (Restaurante) o;
        return puntuacion == restaurante.puntuacion &&
                Objects.equals(nombre, restaurante.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, puntuacion);
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }
}






