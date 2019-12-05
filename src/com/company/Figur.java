package com.company;

import java.awt.*;

public  class Figur {
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

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY(){
        return positionY;
    }

    public int getLinienStaerke(){
        return linienStaerke;
    }

    public Color getLinienFarbe(){
        return linienFarbe;
    }

    public Color getFuellFarbe(){
        return fuellFarbe;
    }

    public void move (int deltaX, int deltaY){
        positionX += deltaX;
        positionY += deltaY;
    }

    public Figur(){

    }
}
