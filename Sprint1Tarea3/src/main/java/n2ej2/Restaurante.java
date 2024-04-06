package n2ej2;
import java.util.Objects;

public class Restaurante implements Comparable<Restaurante> {

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Restaurante restaurante = (Restaurante) obj;
        return puntuacion == restaurante.puntuacion && Objects.equals(nombre, restaurante.nombre);
    }

    @Override
    public int compareTo(Restaurante otroRestaurante) {
        // Comparación por nombre y luego por puntuación
        int comparacionPorNombre = this.nombre.compareTo(otroRestaurante.getNombre());
        if (comparacionPorNombre == 0) {
            return Integer.compare(otroRestaurante.getPuntuacion(), this.puntuacion);
        }
        return comparacionPorNombre;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }
}

