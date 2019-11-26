package com.company;

import java.awt.*;

public class Main {
	private static final Display display = new Display();
	private static Gruppe gruppe = new Gruppe();
    public static void main(String[] args) {
	Rechteck rechteck = new Rechteck(290, 290, 240, 240, 3, Color.cyan, Color.cyan );
	Kreis kreis = new Kreis(150, 150, 30, 3, Color.orange, Color.orange);
	Ellipse ellipse = new Ellipse(200, 200, 40, 50, 3, Color.pink, Color.pink);
	Linie linie = new Linie(250, 250, 35, 60, 3,Color.yellow);
	Text text = new Text(100, 100, "Grafikeditor", 3, Color.blue);

	rechteck.move(30, 100);
	linie.move(200, 120);

	display.hinzufuegen(rechteck);
	display.hinzufuegen(kreis);
	display.hinzufuegen(ellipse);
	display.hinzufuegen(linie);
	display.hinzufuegen(text);

	gruppe.setFigurGruppe(kreis);
	gruppe.setFigurGruppe(rechteck);
	gruppeHinzufuege(gruppe);
    }

    public static void gruppeHinzufuege(Gruppe gruppe) {
    	for(Figur figur : gruppe.figurGruppe){
			display.hinzufuegen(figur);
		}
	}
}
