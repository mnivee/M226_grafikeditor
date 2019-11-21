package com.company;

public class Rechteck extends Figur{
    protected int breite;
    protected int hoehe;

    public Rechteck(int b, int h,int x, int y ){
        super(x, y);
        breite = b;
        hoehe = h;
    }

    public int getBreite(){
        return breite;
    }
    public int getHoehe(){
        return hoehe;
    }
}


