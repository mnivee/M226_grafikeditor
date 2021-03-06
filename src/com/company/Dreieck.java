package com.company;

import java.util.ArrayList;
import java.awt.*;

public class Dreieck extends Figur {

    private ArrayList<Linie> linien = new ArrayList<Linie>();


    public Dreieck(int x1, int y1, int x2, int y2, int x3, int y3, Color farbe){
        super(farbe);
        linien.add(new Linie("Linie", x1, y1,x2, y2,farbe));
        linien.add(new Linie("Linie",x2, y2,x3, y3, farbe));
        linien.add(new Linie("Linie",x3, y3, x1, y1, farbe));
    }

    public void zeichne(Graphics g) {
        for (Linie l : linien) {
            l.zeichne(g);
        }
    }

    public String toString() {
        return null;
    }
}
