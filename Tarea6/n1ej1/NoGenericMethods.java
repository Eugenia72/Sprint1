package Tarea6.n1ej1;

public class NoGenericMethods{
    private String titulo1;
    private String titulo2;
    private String titulo3;


    public NoGenericMethods(String titulo1, String titulo2, String titulo3) {
        this.titulo1 = titulo1;
        this.titulo2 = titulo2;
        this.titulo3 = titulo3;
    }

    public String getTitulo1() {
        return titulo1;
    }
    public String getTitulo2() {
        return titulo2;
    }
    public String getTitulo3() {
        return titulo3;
    }

    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
    }

    public void setTitulo3(String titulo3) {

        this.titulo3 = titulo3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "titulo1='" + titulo1 + '\'' +
                ", titulo2='" + titulo2 + '\'' +
                ", titulo3='" + titulo3 + '\'' +
                '}';
    }
}


