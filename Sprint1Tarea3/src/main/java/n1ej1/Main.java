package n1ej1;

import java.util.ArrayList;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) {


        ArrayList<Month> meses = new ArrayList<>();
        meses.add(new Month("enero"));
        meses.add(new Month("febrero"));
        meses.add(new Month("marzo"));
        meses.add(new Month("abril"));
        meses.add(new Month("mayo"));
        meses.add(new Month("junio"));
        meses.add(new Month("julio"));
        meses.add(new Month("septiembre"));
        meses.add(new Month("octubre"));
        meses.add(new Month("noviembre"));
        meses.add(new Month("diciembre"));

        // Insertar "agosto" en la posición correcta
        meses.add(7, new Month("agosto"));

        // Imprimir la lista con "agosto" insertado
        System.out.println("Meses con agosto:");
        for (Month mes : meses) {
            System.out.print(mes.getName() + " ");
        }
        System.out.println();

        // Convertir ArrayList a HashSet (eliminando duplicados)
        HashSet<Month> mesesUnicos = new HashSet<>(meses);

        // Imprimir meses únicos
        System.out.println("Meses únicos:");
        for (Month mes : mesesUnicos) {
            System.out.println(mes.getName());
        }

    }
}
