package Tarea1.n2ej1;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Opo","Tech");

        smartphone1.alarma();
        smartphone1.fotografiar();
        smartphone1.llamar("123456789");
        System.out.println(smartphone1.toString());


    }
}
