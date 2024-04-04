package Tarea4.n1ej1;

import java.util.ArrayList;

public class Meses {
    private ArrayList<String> mesesAnyo;


    public Meses() {
        mesesAnyo = new ArrayList<>();
        mesesAnyo.add("Enero");
        mesesAnyo.add("Febrero");
        mesesAnyo.add("Marzo");
        mesesAnyo.add("Abril");
        mesesAnyo.add("Mayo");
        mesesAnyo.add("Junio");
        mesesAnyo.add("Julio");
        mesesAnyo.add("Agosto");
        mesesAnyo.add("Septiembre");
        mesesAnyo.add("Octubre");
        mesesAnyo.add("Noviembre");
        mesesAnyo.add("Diciembre");
    }

    public ArrayList<String> getMesesAnyo() {
        return mesesAnyo;
    }

    public void setMesesAnyo(ArrayList<String> mesesAnyo) {
        this.mesesAnyo = mesesAnyo;
    }

    @Override
    public String toString() {
        return "Los meses del año son " +
                 mesesAnyo;
    }
}

