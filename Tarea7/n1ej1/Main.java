package Tarea7.n1ej1;

public class Main {

    public static void main(String[] args) {

        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Eugenio", "Perez", 25, 10.50);
        System.out.println(trabajadorPresencial.calcularSueldo(40));

        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Mariana", "Diaz", 25);
        System.out.println(trabajadorOnline.calcularSueldo(40));


    }
}

