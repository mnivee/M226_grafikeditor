package com.company;

import java.awt.*;
import java.util.Vector;

public class Gruppe extends Figur {

    public Vector<Figur> figurenGruppe;

    public Gruppe(){
        super();
        figurenGruppe = new Vector<Figur>();
    }

    /**
     * Figur zum Vektor hinzufügen.
     * @param f
     */
    public void gruppiereFigur(Figur f) {
        figurenGruppe.add(f);
    }

    @Override
    public void zeichne(Graphics g) { }

    @Override
    public String toString() {
        return null;
    }
}