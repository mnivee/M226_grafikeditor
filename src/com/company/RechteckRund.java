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

    RechteckRund(int positionX, int positionY, int breite, int hoehe, int bogenHoehe, int bogenBreite, int linienStaerke, Color linienFarbe, Color fuellFarbe) {
    super(positionX, positionY, linienStaerke, linienFarbe, fuellFarbe);
    this.breite = breite;
    this.hoehe = hoehe;
    this.bogenHoehe = bogenHoehe;
    this.bogenBreite = bogenBreite;
    }

    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (linienFarbe != null) {
            g2.setStroke(new BasicStroke(linienStaerke));
            g2.setColor(fuellFarbe);
            g2.fillRoundRect(positionX, positionY, breite, hoehe, bogenBreite, bogenHoehe);
            g2.setColor(linienFarbe);
            g2.drawRoundRect(positionX, positionY, breite, hoehe, bogenBreite, bogenHoehe);
        } else {
            g2.fillRoundRect(positionX, positionY, breite, hoehe, bogenBreite, bogenHoehe);
        }
    }
}
