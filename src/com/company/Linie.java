package com.company;

import java.awt.*;

public class Linie extends Figur {
    protected int endeX;
    protected int endeY;


    public Linie(int positionX, int positionY, int endeX, int endeY,int linienStaerke, Color linienFarbe){
        super(positionX, positionY, linienStaerke, linienFarbe);
        this.endeX = endeX;
        this.endeY = endeY;
    }

    public int getEndeX(){
        return endeX;

    }

    public int getEndeY(){
        return endeY;
    }

@Override
    public void move(int deltaX, int deltaY){
        super.move(deltaX, deltaY);
        endeX += deltaX;
        endeY += deltaY;
    }

}
