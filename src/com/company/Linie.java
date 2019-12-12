package com.company;

import java.awt.*;

public class Linie extends Figur {
    protected int endeX;
    protected int endeY;

    public Linie(int positionX, int positionY, int endeX, int endeY){
        super(positionX, positionY);
        this.endeX = endeX;
        this.endeY = endeY;
    }
    public Linie(int positionX, int positionY, int endeX, int endeY,int linienStaerke, Color linienFarbe){
        super(positionX, positionY, linienStaerke, linienFarbe);
        this.endeX = endeX;
        this.endeY = endeY;
    }

@Override
    public void move(int deltaX, int deltaY){
        super.move(deltaX, deltaY);
        endeX += deltaX;
        endeY += deltaY;
    }

    // @Override
    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (linienFarbe != null) {
            g2.setStroke(new BasicStroke(linienStaerke));
            g2.setColor(linienFarbe);
        }
        g2.drawLine(positionX, positionY, endeX, endeY);
    }

}
