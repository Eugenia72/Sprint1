package Tarea8.n1ej3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> meses = Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre");

        meses.forEach(mes -> System.out.println(mes));
    }
}

