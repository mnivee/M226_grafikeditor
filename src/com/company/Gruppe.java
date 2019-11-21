package com.company;

import java.util.ArrayList;

public class Gruppe {
    protected ArrayList<Figur> figurGruppe;

    public Gruppe(){
        figurGruppe= new ArrayList<Figur>();
    }

    /*
        * Figuren hinzufügen
        * param f
     */
    public void setFigurGruppe(Figur f){
        figurGruppe.add(f);
    }

}
