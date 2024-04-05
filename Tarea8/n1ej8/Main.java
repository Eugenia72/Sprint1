package Tarea8.n1ej8;


public class Main {
    public static void main(String[] args) {
        Reverse reverser = (input) -> {
            StringBuilder builder = new StringBuilder(input);
            builder.reverse();
            return builder.toString();
        };

        String alreves = reverser.getReverse("Iría a la tierra de los abuelos");
        System.out.println(alreves);
    }
}