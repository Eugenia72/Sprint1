package Tarea5.n1ej5;

import java.io.*;

public class Botella implements Serializable {
    private String color;
    private String marca;

    public Botella(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void serializarBotella() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("botella.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
            System.out.println("Botella serializada exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al serializar la botella: " + e.getMessage());
        }
    }

    public void deserializarBotella() {
        try {
            FileInputStream fileInputStream = new FileInputStream("botella.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Botella botellaDeserializada = (Botella) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("Botella deserializada exitosamente." + botellaDeserializada.getColor() + " " + botellaDeserializada.getMarca());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar la botella: " + e.getMessage());

        }
    }

    @Override
    public String toString() {
        return "Botella{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

}

