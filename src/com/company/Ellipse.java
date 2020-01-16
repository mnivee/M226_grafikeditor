package com.company;

import java.awt.*;

public class Ellipse extends Figur {
    private int langerRadius;
    private int kurzerRadius;
    private String name;

    Ellipse(String name, int positionX, int positionY, int langerRadius, int kurzerRadius) {
        super(positionX, positionY);
        this.langerRadius = langerRadius;
        this.kurzerRadius = kurzerRadius;
        this.name = name;
    }

    Ellipse(String name, int positionX, int positionY, int langerRadius, int kurzerRadius, Color farbe) {
        super(positionX, positionY, farbe);
        this.langerRadius = langerRadius;
        this.kurzerRadius = kurzerRadius;
        this.name = name;
    }

    /**
     * Setzt die Einstellungen zum Zeichnen der Ellipse und zeichnet sie.
     * @param g
     */
    @Override
    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(farbe);
        g2.drawOval(positionX, positionY, langerRadius, kurzerRadius);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", name, positionX, positionY, langerRadius, kurzerRadius);
    }
}