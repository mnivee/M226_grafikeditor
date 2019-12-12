package com.company;

import java.awt.*;

public class Text extends Figur{
    protected String text;

    public Text(int positionX, int positionY, String text ,int linienStaerke, Color linienFarbe){
        super(positionX, positionY, linienStaerke, linienFarbe);
        this.text = text;
    }
    // @Override
    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font font = g2.getFont();
        g2.setFont(new Font(font.getFontName(), Font.PLAIN, linienStaerke * font.getSize()));
        g2.setColor(linienFarbe);
        g2.drawString(text, positionX, positionY);
    }
}
