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

    public int getBreite(){
        return breite;
    }
    public int getHoehe(){
        return hoehe;
    }
}


