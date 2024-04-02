package Tarea2.n1ej1;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> listProductos;
    private double priceTotalVenta;

    public Venta(ArrayList<Producto> listProductos, double priceTotalVenta) {
        this.listProductos = listProductos;
        this.priceTotalVenta = priceTotalVenta;
    }

    public ArrayList<Producto> getListProductos() {

        return listProductos;
    }

    public double getPriceTotalVenta() {

        return priceTotalVenta;
    }

    public void setListProductos(ArrayList<Producto> listProductos) {

        this.listProductos = listProductos;
    }

    public void setPriceTotalVenta(double priceTotalVenta) {

        this.priceTotalVenta = priceTotalVenta;
    }

    public void anadirProductos(Producto producto) {

        this.listProductos.add(producto);
    }

    public void calcularTotal() throws VentaVaciaException {

        if (listProductos.isEmpty()) {
            throw new VentaVaciaException("Para realizar una venta tienes que añadir un producto");
        } else {
            double total=0;
        }
            for (Producto producto : listProductos) {
                priceTotalVenta += producto.getPrice();


                System.out.println(priceTotalVenta);
            }
    }

    @Override
    public String toString() {
        return "Venta{" +
                "productos=" + listProductos +
                ", priceTotalVenta=" + priceTotalVenta +
                '}';
    }
}








