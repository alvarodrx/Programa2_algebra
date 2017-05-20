/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
/**
 *
 * @author alvar_000
 */
public class DibujoVector extends JPanel {
    Graphics g;
    Linea l;
    Color c;
    
    @Override
    protected void paintComponent(Graphics g){
        g = dibujarLinea(g);
        
    }
    
    public DibujoVector(Linea l, Color c) {
        this.l = l;
        this.c = c;
        
    }
    
    public Graphics dibujarLinea(Graphics g){
        g.setColor(c);
        g.drawLine(l.getA().getX(), l.getA().getY(), l.getB().getX(), l.getB().getY());
        return g;
    }
    
}
