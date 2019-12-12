package com.company;

import java.awt.*;

public class Kreis extends Figur {
    protected int radius;

    public Kreis(int positionX, int positionY, int radius,int linienStaerke, Color linienFarbe, Color fuellFarbe){
        super(positionX, positionY, linienStaerke, linienFarbe, fuellFarbe);
        this.radius = radius;
    }

    // @Override
    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (linienFarbe != null) {
            g2.setStroke(new BasicStroke(linienStaerke));
            g2.setColor(fuellFarbe);
            g2.fillOval(positionX, positionY, radius, radius);
            g2.setColor(linienFarbe);
            g2.drawOval(positionX, positionY, radius, radius);
        } else {
            g2.fillOval(positionX, positionY, radius, radius);
        }
    }
}
