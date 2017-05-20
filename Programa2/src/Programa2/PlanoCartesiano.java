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
public class PlanoCartesiano extends JPanel{
    Graphics g;
    Linea l;

    PlanoCartesiano() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected void paintComponent(Graphics g){
        g = dibujarPlano(g);
        this.setAutoscrolls(true);
        this.g = g;
        
    }
    
    
   

    public PlanoCartesiano(Linea l) {
        this.l = l;
        
    }
    
    public Graphics dibujarLinea(Graphics g){
        g.drawLine(l.getA().getX(), l.getA().getY(), l.getB().getX(), l.getB().getY());
        return g;
    }
    
    public Graphics dibujarPlano(Graphics g){
        
        for(int i = 0; i <= 300; i+=30){
            g.setColor(Color.red);
            for(int j = 0; j <= 300; j+=6){
                g.drawLine(j, i, j+1, i);
            }
            
            g.setColor(Color.blue);
            for(int j = 0; j <= 300; j+=6){
                g.drawLine(i,j,i,j+1);
            }
            
        }
        //g.drawLine(l.getA().getX(), l.getA().getY(), l.getB().getX(), l.getB().getY());
        g.setColor(Color.blue);
        g.drawRect(150, 0, 1, 300);
        
        g.setColor(Color.red);
        g.drawRect(0, 150, 300, 1);
        return g;
    }
    
    
    public Graphics dibujarVector(Punto p){
        g.drawLine(150, 150, p.getX(), p.getY());
        return g;
    }
}
