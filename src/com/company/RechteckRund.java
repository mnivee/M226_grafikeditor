
package com.company;

import java.awt.*;

public class RechteckRund extends Figur {
    private int breite;
    private int hoehe;
    private int bogenHoehe;
    private int bogenBreite;
    private String name;

    RechteckRund(String name, int xPosition, int yPosition, int hoehe, int breite, int bogenHoehe, int bogenBreite) {
        super(xPosition, yPosition);
        this.hoehe = hoehe;
        this.breite = breite;
        this.bogenHoehe = bogenHoehe;
        this.bogenBreite = bogenBreite;
        this.name = name;
    }

    RechteckRund(String name, int xPosition, int yPosition, int hoehe, int breite, int bogenHoehe, int bogenBreite, Color farbe) {
        super(xPosition, yPosition, farbe);
        this.hoehe = hoehe;
        this.breite = breite;
        this.bogenHoehe = bogenHoehe;
        this.bogenBreite = bogenBreite;
        this.name = name;
    }

    /**
     * Setzt die Einstellungen zum Zeichnen des abgerundeten Rechtecks und zeichnet es.
     * @param g
     */
    @Override
    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(farbe);
        g2.drawRoundRect(positionX, positionY, breite, hoehe, bogenBreite, bogenHoehe);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", name, positionX, positionY, breite, hoehe, bogenBreite, bogenHoehe);
    }
}