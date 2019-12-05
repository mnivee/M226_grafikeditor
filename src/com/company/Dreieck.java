package com.company;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.awt.*;

public class Dreieck extends Figur {

    private ArrayList<Linie> linien = new ArrayList<Linie>();



    public Dreieck(int x1, int y1, int x2, int y2, int x3, int y3, int linienStaerke, Color linienFarbe){
        super(linienStaerke, linienFarbe );
        linien.add( new Linie(x1, y1,x2, y2,linienStaerke,linienFarbe));
        linien.add(new Linie(x2, y2,x3, y3, linienStaerke, linienFarbe));
        linien.add(new Linie(x3, y3, x1, y1, linienStaerke, linienFarbe));
    }

    public ArrayList<Linie> getLinien(){
        return linien;
    }
}
