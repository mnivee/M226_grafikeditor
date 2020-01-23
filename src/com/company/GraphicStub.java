package com.company;

public class GraphicStub extends ConcreteGraphics{
    int numOfDrawOvalCalls;
    int x, y, width, height;

    @Override
    public void drawOval(int x, int y, int width, int height) {
        numOfDrawOvalCalls++;
        this.x = x ;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

