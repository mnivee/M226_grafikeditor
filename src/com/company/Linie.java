package com.company;

public class Linie extends Figur {
    protected int positionX;
    protected int positionY;
    protected int endX = 70;
    protected int endY = 60;

    public Linie( int  x, int y, int posX, int posY){
        super(x, y);
        this.positionX = posX;
        this.positionY = posY;
    }

    public int getPositionX(){
        return endX;

    }

    public int getPositionY(){
        return endY;
    }
}
