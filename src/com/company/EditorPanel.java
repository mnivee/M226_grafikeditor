package com.company;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorPanel extends JPanel{
    private EditorControl editorControl;

    final private class EditorMouseAdapter extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent event) {
            editorControl.setErsterPunkt(event.getPoint());
        }
        @Override
        public void mouseReleased(MouseEvent event) {
            editorControl.erzeugeFigurMitZweitemPunkt(event.getPoint());
            repaint();
        }
    }
    final private class EditorKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent event) {
            editorControl.setFigurTyp(event.getKeyChar());
        }
    }
    EditorPanel(EditorControl control) {
        editorControl = control;
        addKeyListener(new EditorKeyAdapter());
        addMouseListener(new EditorMouseAdapter());
        setFocusable(true);
        requestFocusInWindow();
    }
    // Neu zeichnen
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        editorControl.allesNeuZeichnen(g);
    }
}