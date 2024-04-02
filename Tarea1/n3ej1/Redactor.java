package Tarea1.n3ej1;

import java.util.ArrayList;

public class Redactor {
    private String nombre;
    private String Dni;
    private double sueldo = 1500;
    private ArrayList<Noticia> noticias = new ArrayList<Noticia>();

    public Redactor(String nombre, String Dni) {
        this.Dni = Dni;
        this.nombre = nombre;

    }

    public String getDni() {
        return Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void redactar() {
        System.out.println("El redactor " + this.getNombre() + " con DNI " + this.getDni() + " ha redactado una noticia");
    }

    public void anadirNoticia(Noticia noticia) {
        this.noticias.add(noticia);
    }

    public void removeNoticia(int posicion) {
        this.noticias.remove(posicion);
    }

    @Override
    public String toString() {
        return "Redactor{" +
                "nombre='" + nombre + '\'' +
                ", Dni='" + Dni + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
