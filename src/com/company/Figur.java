package com.company;

import java.awt.*;

public abstract class Figur {
    protected int positionX;
    protected int positionY;
    protected int linienStaerke;
    protected Color linienFarbe;
    protected Color fuellFarbe;


    public Figur(int positionX, int positionY, int linienStaerke, Color linienFarbe, Color fuellFarbe){
        this.positionX = positionX;
        this.positionY = positionY;
        this.linienStaerke = linienStaerke;
        this.linienFarbe = linienFarbe;
        this.fuellFarbe = fuellFarbe;
    }

    public Figur(int positionX, int positionY, int linienStaerke, Color linienFarbe){
        this.positionX = positionX;
        this.positionY = positionY;
        this.linienStaerke = linienStaerke;
        this.linienFarbe = linienFarbe;
    }

    public Figur(int linienStaerke, Color linienFarbe){
        this.linienStaerke = linienStaerke;
        this.linienFarbe = linienFarbe;
    }

    public void move (int deltaX, int deltaY){
        positionX += deltaX;
        positionY += deltaY;
    }

    public Figur(){
    }
    public abstract void zeichne(Graphics g);
}
