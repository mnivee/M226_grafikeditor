package com.company;

import java.awt.*;

public class Ellipse extends Figur{
    protected int langerRadius;
    protected  int kurzrRadius;


    public Ellipse(int positionX, int positionY, int langerRadius, int kurzrRadius){
        super(positionX, positionY);
        this.langerRadius = langerRadius;
        this.kurzrRadius = kurzrRadius;
    }

    public Ellipse(int positionX, int positionY, int langerRadius, int kurzrRadius, Color farbe){
        super(positionX, positionY, farbe);
        this.langerRadius = langerRadius;
        this.kurzrRadius = kurzrRadius;
    }

    // @Override
    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(farbe);
        g2.drawOval(positionX, positionX, langerRadius, kurzrRadius);
    }
}
