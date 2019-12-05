package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.ElementIterator;
import javax.swing.text.TabExpander;

/**
 * Die Klasse Display stellt ein Fenster auf dem Bildschirm zur Verf�gung, in welchem
 * Figur-Objekte dargestellt werden k�nnen.
 * Siehe auch Java-Grundkurs Abschnitt 10.2 und 10.3.
 *
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")

public class Display extends JFrame {
    /**
     * Die Liste der dargestellten Figur-Objekte
     */
    private List<Figur> figuren = new ArrayList<Figur>();

    /**
     * * Konstruktor. Initialisiert das Fenster in der Mitte des Bildschirms und erzeugt ein
     * JFrame-Objekt, auf welchem die Figuren gezeichnet werden.
     */
    public Display() {
        Dimension windowSize = new Dimension(800, 600);
        setSize(windowSize);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int windowPositionX = (screenSize.width - windowSize.width) / 2;
        int windowPositionY = (screenSize.height - windowSize.height) / 2;
        Point windowPosition = new Point(windowPositionX, windowPositionY);
        setLocation(windowPosition);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createAndAddDrawingPanel();
        setVisible(true);
    }

    private void createAndAddDrawingPanel() {
        // Das JPanel-Objekt ist ein Objekt einer anonymen Unterklasse von JPanel
        // Siehe Java-Grundkurs Abschnitt 3.9
        add(new JPanel() {
            // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
            // Methode beim Dsiplay aufruft.
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                zeichneFiguren(g);
            }
        });
    }

    /**
     * Zeichnet alle Figuren.
     *
     * @param g Referenz auf das Graphics-Objekt zum zeichnen.
     */
    private void zeichneFiguren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (Figur f : figuren) {
            if (f instanceof Rechteck) {
                Rechteck r = (Rechteck) f;
                zeichneRechteck(g2, r);
            }
            else if(f instanceof Linie){
                Linie l = (Linie)f;
                zeichneLinie(g2, l);
            }
            else if(f instanceof Kreis) {
                Kreis k = (Kreis)f;
                zeichneKreis(g2, k);
            }
            else if(f instanceof Ellipse){
                Ellipse e = (Ellipse)f;
                zeichneEllipse(g2, e);
            }
            else if(f instanceof Text){
                Text t = (Text)f;
                zeichneText(g2, t);
            }
            else if(f instanceof Dreieck){
                Dreieck d = (Dreieck)f;
               zeichneDreieck(g2, d);
            }

            }
            /* TODO: Hier muss für jede weitere Figur-Klasse, welche dargestellt werden k�nnen muss,
             * ein analoger Abschnitt, wie f�r die Rechteck-Klasse folgen.
             */
        }

        /**
         * Fügt eine weitere Figur hinzu und löst die Auffrischung des Fensterinhaltes aus.
         * @param figur Referenz auf das weitere Figur-Objekt.
         */
        public void hinzufuegen(Figur figur){
            figuren.add(figur);
            repaint();
        }
        /**
         * Löscht alle Figuren und löst die Auffrischung des Fensterinhaltes aus.
         */
        public void allesLoeschen(){
            figuren.clear();
            repaint();
        }
        /*
        * Zeichnet einen Rechteck
         */
        private void zeichneRechteck(Graphics2D g2, Rechteck r){
            g2.setStroke(new BasicStroke(r.getLinienStaerke()));
            g2.setColor(r.getFuellFarbe());
            g2.fillRect(r.getPositionX(), r.getPositionY(), r.getBreite(), r.getHoehe());
            g2.setColor(r.getLinienFarbe());
            g2.drawRect(r.getPositionX(), r.getPositionY(), r.getBreite(), r.getHoehe());
        }

        /*
        * Zeichnet eine Linie
         */
        private void zeichneLinie(Graphics2D g2, Linie l) {
            g2.setStroke(new BasicStroke(l.getLinienStaerke()));
            g2.setColor(l.getLinienFarbe());
            g2.drawLine(l.getPositionX(), l.getPositionY(), l.getEndeX(), l.getEndeY());
        }

        private void zeichneDreieck(Graphics2D g2, Dreieck d){
            ArrayList<Linie> linien = d.getLinien();
            for( Linie l : linien){
                zeichneLinie(g2, l);
            }
        }

        /*
        * Zeichnet einen Kreis
         */
        private void zeichneKreis(Graphics2D g2, Kreis k) {
            g2.setStroke(new BasicStroke(k.getLinienStaerke()));
            g2.setColor(k.getFuellFarbe());
            g2.fillOval(k.getPositionX(), k.getPositionY(), k.getRadius(), k.getRadius());
            g2.setColor(k.getLinienFarbe());
            g2.drawOval(k.getPositionX(), k.getPositionY(), k.getRadius(), k.getRadius());
        }
        /*
        * Zeichnet eine Ellipse
         */
        private void zeichneEllipse(Graphics2D g2, Ellipse e) {
            g2.setStroke(new BasicStroke(e.getLinienStaerke()));
            g2.setColor(e.getFuellFarbe());
            g2.fillOval(e.getPositionX(), e.getPositionY(), e.getLangerRadius(), e.getKurzrRadius());
            g2.setColor(e.getLinienFarbe());
            g2.drawOval(e.getPositionX(), e.getPositionY(), e.getLangerRadius(), e.getKurzrRadius());
        }
        /*
        * Schreibt einen Text
         */

        private void zeichneText(Graphics2D g2, Text t) {
            Font font = g2.getFont();
            g2.setFont(new Font(font.getFontName(), Font.PLAIN, t.getLinienStaerke() * font.getSize()));
            g2.setColor(t.getLinienFarbe());
            g2.drawString(t.getText(), t.getPositionX(), t.getPositionY());
        }

}

