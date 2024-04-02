package Tarea1.n1ej1;

public class Main {
    public static void main(String[] args) {

        Viento viento = new Viento("Trompeta", 1000);
        viento.tocar();

        Cuerda cuerda = new Cuerda("Violonchelo", 150);
        cuerda.tocar();

        Percusion percusion = new Percusion("Bateria", 500);
        percusion.tocar();
    }


    }






