package com.company;

import java.awt.*;

public class Text extends Figur{
    protected String text;

    public Text(int positionX, int positionY, String text ,int linienStaerke, Color linienFarbe){
        super(positionX, positionY, linienStaerke, linienFarbe);
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
