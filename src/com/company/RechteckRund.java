package com.company;

import java.awt.*;

public class RechteckRund extends Figur {
    private int breite;
    private int hoehe;
    private int bogenHoehe;
    private int bogenBreite;

    RechteckRund(int positionX, int positionY, int breite, int hoehe, int bogenHoehe, int bogenBreite){
    super(positionX, positionY);
    this.breite = breite;
    this.hoehe = hoehe;
    this.bogenHoehe = bogenHoehe;
    this.bogenBreite = bogenBreite;
    }

    RechteckRund(int positionX, int positionY, int breite, int hoehe, int bogenHoehe, int bogenBreite, Color farbe) {
    super(positionX, positionY, farbe);
    this.breite = breite;
    this.hoehe = hoehe;
    this.bogenHoehe = bogenHoehe;
    this.bogenBreite = bogenBreite;
    }

    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(farbe);
        g2.drawRoundRect(positionX, positionY, breite, hoehe, bogenBreite, bogenHoehe);

    }
}
