/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lchaqui.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Punto {
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "P ("+getX()+","+getY()+")"; //To change body of generated methods, choose Tools | Templates.
    //imprimir todos los puntos
    
    }
    public static double CalcularDistancia(Punto p1, Punto p2){
        return Math.sqrt(Math.pow(((double)p2.getX()-(double)p1.getX()),2)+Math.pow(((double)p2.getY()-(double)p1.getY()),2));
        
    }
    static ArrayList<Punto>puntos= new ArrayList<Punto>();
    public static void almacenarPuntos(int x,int y){
      puntos.add(new Punto(x,y));
    }
    public static void imprimirPuntos(){
        String datos="";
        for (Punto punto : puntos) {
            datos+="\n"+punto.toString();
        }
        JOptionPane.showMessageDialog(null, datos);
    }
}
