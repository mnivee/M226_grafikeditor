package com.company;

public class Main {
	private static final Display display = new Display();

    public static void main(String[] args) {
	Rechteck r = new Rechteck(150, 150, 150, 150);
	display.hinzufuegen(r);

	Kreis k = new Kreis(100, 200, 200);
	display.hinzufuegen(k);

	Ellipse e = new Ellipse(25,25,50,80);
	display.hinzufuegen(e);

	Linie l = new Linie(0, 0, 0, 0);
	display.hinzufuegen(l);

	Gruppe g = new Gruppe();

    }

}
