package com.company;

import java.awt.*;
public class Rechteck extends Figur{
    protected int breite;
    protected int hoehe;

    public Rechteck(int positionX, int positionY, int breite, int hoehe){
        super(positionX, positionY);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public Rechteck(int positionX, int positionY, int breite, int hoehe, Color farbe){
        super(positionX, positionY, farbe);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    // @Override

    public void zeichne(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(farbe);
            g2.drawRect(positionX, positionY, breite, hoehe);
        }
    }



