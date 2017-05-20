/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa2;

/**
 *
 * @author alvar_000
 */
public class Linea {
    Punto a, b;
    
    public Linea(Integer x1, Integer y1, Integer x2, Integer y2){
        a = new Punto(x1, y1);
        b = new Punto(x2, y2);
    }

    public Linea(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    public Punto getA() {
        return a;
    }

    public void setA(Punto a) {
        this.a = a;
    }

    public Punto getB() {
        return b;
    }

    public void setB(Punto b) {
        this.b = b;
    }
    
    public Double distancia(){
        return Math.sqrt(Math.pow((b.getX() - a.getX()) ,2) + Math.pow(b.getY() - a.getY(),2));
    }
    
}
