package com.company;

public class Kreis extends Figur {
    protected int radius;

    public Kreis(int x, int y, int r){
        super(x, y);
        radius = r;
    }

    public int getRadius(){
        return radius;
    }
}
