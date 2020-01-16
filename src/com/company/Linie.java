package com.company;

import java.awt.*;

public class Linie extends Figur {
    private int endeX;
    private int endeY;
    private String name;

    public Linie(String name, int positionX, int positionY, int endeX, int endeY){
        super(positionX, positionY);
        this.endeX = endeX;
        this.endeY = endeY;
        this.name = name;
    }
    public Linie(String name, int positionX, int positionY, int endeX, int endeY, Color farbe){
        super(positionX, positionY, farbe);
        this.endeX = endeX;
        this.endeY = endeY;
        this.name = name;

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
        g2.setColor(farbe);
        g2.drawLine(positionX, positionY, endeX, endeY);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", name, positionX, positionY, endeX, endeY);
    }

}

