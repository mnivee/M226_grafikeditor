package com.company;

import java.awt.*;

public class Rechteck extends Figur {
    private int breite;
    private int hoehe;
    private String name;

    Rechteck(String name, int xPosition, int yPosition, int hoehe, int breite) {
        super(xPosition, yPosition);
        this.hoehe = hoehe;
        this.breite = breite;
        this.name = name;
    }

    Rechteck(String name, int xPosition, int yPosition, int hoehe, int breite, Color farbe) {
        super(xPosition, yPosition, farbe);
        this.hoehe = hoehe;
        this.breite = breite;
        this.name = name;
    }

    /**
     * Setzt die Einstellungen zum Zeichnen des Rechtecks und zeichnet es.
     * @param g
     */
    @Override
    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(farbe);
        g2.drawRect(positionX, positionY, breite, hoehe);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", name, positionX, positionY, hoehe, breite);
    }
}