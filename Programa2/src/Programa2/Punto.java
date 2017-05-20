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
public class Punto {
    private Integer x;
    private Integer y;

    public Punto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
    
    public Integer cuadrante(){
        if (x == 0 && y == 0){
            return 0;
        }else{
            if(x >= 0 && y > 0){
                return 1;
            }else{
                if(x < 0 && y >= 0){
                    return 2;
                }else{
                    if(x < 0 && y < 0){
                        return 3;
                    }else{
                        return 4;
                    }
                }
            }
            
        }
    }
    
}
