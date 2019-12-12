package com.company;

import java.awt.*;
public class Rechteck extends Figur{
    protected int breite;
    protected int hoehe;

    public Rechteck(int positionX, int positionY, int breite, int hoehe,int linienStaerke, Color linienFarbe, Color fuellFarbe){
        super(positionX, positionY, linienStaerke, linienFarbe, fuellFarbe);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    // @Override

    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (fuellFarbe != null) {
            g2.setStroke(new BasicStroke(linienStaerke));
            g2.setColor(fuellFarbe);
            g2.fillRect(positionX, positionY, breite, hoehe);
            g2.setColor(linienFarbe);
            g2.drawRect(positionX, positionY, breite, hoehe);
        } else {
            g2.fillRect(positionX, positionY, breite, hoehe);
        }
    }
}


