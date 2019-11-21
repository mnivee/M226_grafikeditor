package com.company;

import java.awt.*;

public class Kreis extends Figur {
    protected int radius;

    public Kreis(int positionX, int positionY, int radius,int linienStaerke, Color linienFarbe, Color fuellFarbe){
        super(positionX, positionY, linienStaerke, linienFarbe, fuellFarbe);
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }
}
