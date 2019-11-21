package com.company;

public class Ellipse extends Figur{
    protected int width;
    protected  int height;

    public Ellipse(int x, int y, int w, int h){
        super(x, y);
        width = w;
        height = h;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}
