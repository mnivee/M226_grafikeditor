package com.company;
import java.awt.*;

public class Ellipse extends Figur{
    protected int langerRadius;
    protected  int kurzrRadius;

    public Ellipse(int positionX, int positionY, int langerRadius, int kurzrRadius,int linienStaerke, Color linienFarbe, Color fuellFarbe){
        super(positionX, positionY, linienStaerke, linienFarbe);
        this.langerRadius = langerRadius;
        this.kurzrRadius = kurzrRadius;
    }

    public int getLangerRadius(){
        return langerRadius;
    }

    public int getKurzrRadius(){
        return kurzrRadius;
    }
}
