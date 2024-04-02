package Tarea2.n1ej1;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> listProductos = new ArrayList<>();

        Producto producto1 = new Producto("Sabana",25);
        Producto producto2 = new Producto("Camisa",50);
        Producto producto3 = new Producto("Pantalon",35);

        Venta venta1 = new Venta(listProductos, 0.0);



        try {
            venta1.calcularTotal();
            System.out.println("El precio total de la venta es: " + venta1.getPriceTotalVenta());
        } catch (VentaVaciaException e) {
            System.out.println(e.getMessage());
        }
        try {
            Producto[] listProductos2 = {};
            System.out.print(listProductos2[1]); // Intentar acceder al elemento
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}