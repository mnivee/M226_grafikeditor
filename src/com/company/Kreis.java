package com.company;

import java.awt.*;

public class Kreis extends Figur {
    private int radius;
    private String name;

    Kreis(String name, int xPosition, int yPosition, int radius) {
        super(xPosition, yPosition);
        this.radius = radius;
        this.name = name;
    }

    Kreis(String name, int xPosition, int yPosition, int radius, Color farbe) {
        super(xPosition, yPosition, farbe);
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