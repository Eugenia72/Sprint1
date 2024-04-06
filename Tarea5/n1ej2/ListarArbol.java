
/*Añade a la clase del ejercicio anterior, la funcionalidad de listar un árbol de directorios
con el contenido de todos sus niveles (recursivamente) de manera que se impriman en pantalla en
 orden alfabético dentro de cada nivel, indicando
 además si es un directorio (D) o un fichero (F),
 y su última fecha de modificación.

 */
package Tarea5.n1ej2;

import java.text.SimpleDateFormat;
import java.io.File;
import java.util.Arrays;

public class ListarArbol {


    private String rutaArchivo; // atributo para almacenar la ruta del directorio

    public ListarArbol(String ruta) {
        this.rutaArchivo = ruta;
    }

    public void imprimirDirectorio(File file) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        if (file.isDirectory()) {
            System.out.println("D: " + file.getName() + " Fecha de última modificación: " + formatoFecha.format(file.lastModified()) + ")");
            File[] listaContenido = file.listFiles();
            if (listaContenido != null) {
                Arrays.sort(listaContenido);
                for (File contenido : listaContenido) {
                    imprimirDirectorio(contenido);
                }
            }
        } else if (file.isFile()) {
            System.out.println("F: " + file.getName() + " Fecha de última modificación: " + formatoFecha.format(file.lastModified()) + ")");
        } else {
            System.out.println("No es ni un fichero ni un directorio.");
        }
    }

    public void listarDirectorioCompleto() {
        File file = new File(rutaArchivo);
        imprimirDirectorio(file);
    }


    }












