package com.company;

import java.awt.*;

public class Kreis extends Figur {
    private int radius;
    private String name;

    Kreis(String name, int positionX, int positionY, int radius) {
        super(positionX, positionY);
        this.radius = radius;
        this.name = name;
    }

    Kreis(String name, int positionX, int positionY, int radius, Color farbe) {
        super(positionX, positionY, farbe);
        this.radius = radius;
        this.name = name;
    }

    /**
     * Setzt die Einstellungen zum Zeichnen des Kreises und zeichnet ihn.
     * @param g
     */
    @Override
    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(farbe);
        g2.drawOval(positionX, positionY, radius, radius);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s", name, positionX, positionY, radius);
    }

}