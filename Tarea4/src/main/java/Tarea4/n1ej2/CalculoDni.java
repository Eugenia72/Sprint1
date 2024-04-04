package Tarea4.n1ej2;

public class CalculoDni {


    private static final String LETRASDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calcularLetraDni(int numeroDni) {
        int resto = numeroDni % 23;
        return LETRASDNI.charAt(resto);
    }
}
/*Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un
espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.*/