package com.company;
import java.awt.*;
import java.util.ArrayList;

public class Gruppe extends Figur{
    public ArrayList<Figur> figurGruppe = new ArrayList<Figur>();

    public void Gruppe() {
    }

    /*
        * Figuren hinzufügen
        * param f
     */
    public void setFigurGruppe(Figur f){
        figurGruppe.add(f);
    }

    public void zeichne(Graphics g) { }
    }
