package com.company;

import java.awt.*;

final class EditorControl {
    private Zeichnung zeichnung = new Zeichnung();
    private char figurTyp;
    private Point ersterPunkt;

    public void allesNeuZeichnen(Graphics g) {
        zeichnung.zeichneFiguren(g);
    }

    public void setFigurTyp(char figurTyp) {
        this.figurTyp = figurTyp;
    }

    public void setErsterPunkt(Point ersterPunkt) {
        this.ersterPunkt = ersterPunkt;
        System.out.println(ersterPunkt.x + " " +ersterPunkt.y);
    }

    public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
        int x = Math.min(zweiterPunkt.x, ersterPunkt.x);
        int y = Math.min(zweiterPunkt.y, ersterPunkt.y);
        int hoehe = Math.abs(zweiterPunkt.y - ersterPunkt.y);
        int breite = Math.abs(zweiterPunkt.x - ersterPunkt.x);
        System.out.println(ersterPunkt.x + " " +ersterPunkt.y);
        System.out.println(x + " " +y);

        switch(figurTyp) {
            case 'k':
                int radius = (int) Math.sqrt(hoehe * hoehe + breite * breite);
                Kreis kreis = new Kreis(x, y, radius);
                zeichnung.hinzufuegen(kreis);
                break;
            case 'l':
                Linie linie = new Linie(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y);
                zeichnung.hinzufuegen(linie);
                break;
            case 'r':
                Rechteck rechteck = new Rechteck(x, y, hoehe, breite);
                zeichnung.hinzufuegen(rechteck);
                break;
            case 'e':
                Ellipse ellipse = new Ellipse(x, y, breite, hoehe);
                zeichnung.hinzufuegen(ellipse);
                break;
            case 'a':
                RechteckRund rechteckRund = new RechteckRund(x, y, hoehe, breite, 20, 20);
                zeichnung.hinzufuegen(rechteckRund);
                break;
            case 'd':
                int y3 = (int) Math.sqrt(hoehe * hoehe - (hoehe * hoehe) / 4) + ersterPunkt.y;
                int x3 = hoehe / 2 + ersterPunkt.x;

                Dreieck dreieck = new Dreieck(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y, x3, y3, 2, Color.gray);
                zeichnung.hinzufuegen(dreieck);
                break;
        }
    }
}