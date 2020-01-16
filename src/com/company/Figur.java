package com.company;

        import java.awt.*;

public abstract class Figur {
    protected int positionX;
    protected int positionY;
    protected Color farbe;

    public Figur(){
    }
    public Figur(Color farbe){
        this.farbe = farbe;
    }
    public Figur(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Figur(int positionX, int positionY, Color farbe){
        this.positionX = positionX;
        this.positionY = positionY;
        this.farbe = farbe;
    }

    public void move (int deltaX, int deltaY){
        positionX += deltaX;
        positionY += deltaY;
    }

    public abstract void zeichne(Graphics g);

    public abstract String toString();
}



