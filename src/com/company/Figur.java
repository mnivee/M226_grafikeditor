package com.company;

public class Figur {
    protected int startPositionX;
    protected int startPositionY;

    public Figur(int x, int y){
        this.startPositionX = x;
        this.startPositionY = y;
    }

    public int getX() {
        return startPositionX;
    }

    public int getY(){
        return startPositionY;
    }
}
