package com.company;

import java.awt.*;

public class Kreis extends Figur {
    protected int radius;

    public Kreis(int positionX, int positionY , int radius){
        super(positionX, positionY);
        this.radius = radius;
    }
    public Kreis(int positionX, int positionY, int radius, Color farbe){
        super(positionX, positionY, farbe);
        this.radius = radius;
    }

    // @Override
    public void zeichne(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(farbe);
        g2.drawOval(positionX, positionY, radius, radius);
    }
}
