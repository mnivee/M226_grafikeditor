package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Zeichnung {
    private ArrayList<Figur> figuren;
    public Zeichnung() {
        this.figuren = new ArrayList<>();
    }

    // Zeichnet alle Figuren
    public void zeichneFiguren(Graphics g) {
        for (Figur f : figuren) {
            f.zeichne(g);
        }
    }

    public void hinzufuegen(Figur figur) {
        figuren.add(figur);
    }

    public void allesLoeschen() {
        figuren.clear();
    }
}
