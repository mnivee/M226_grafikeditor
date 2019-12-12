package com.company;
import java.awt.*;

public class Ellipse extends Figur{
    protected int langerRadius;
    protected  int kurzrRadius;

    public Ellipse(int positionX, int positionY, int langerRadius, int kurzrRadius,int linienStaerke, Color linienFarbe, Color fuellFarbe){
        super(positionX, positionY, linienStaerke, linienFarbe);
        this.langerRadius = langerRadius;
        this.kurzrRadius = kurzrRadius;
    }

    // @Override
    public void zeichne(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(linienStaerke));
        g2.setColor(fuellFarbe);
        g2.fillOval(positionX, positionY, langerRadius, kurzrRadius);
        g2.setColor(linienFarbe);
        g2.drawOval(positionX, positionY, langerRadius, kurzrRadius);
    }
}
