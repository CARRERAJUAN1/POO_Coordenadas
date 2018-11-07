/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lchaqui.vista;

import com.lchaqui.modelo.Punto;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Aplicacion {
    public static void main(String[] args) {
        Punto p1 = new Punto(4, 3);
        Punto p2 = new Punto(10, 15);
        int op;
        do {            
         op=Integer.parseInt(JOptionPane.showInputDialog("Deseas ingresar un punto: \n"
            +"1.- Si \n"
            +"2.- No" ));
            if (op==1) {
                int x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese coordenadas X: "));
                int y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese coordenadas Y: "));
             Punto.almacenarPuntos(x, y);  
             
            }
  //
         
        } while (op!=2);
        Punto.imprimirPuntos();
//        int op1;
//        do {            
//            op1=Integer.parseInt(JOptionPane.showInputDialog("Deseas calcular la distancia de dos puntos un punto: \n"
//            +"1.- Si \n"
//            +"2.- No" ));
//            if (op1==1) {
//            JOptionPane.showMessageDialog(null,p1.toString()+"\n"+ p2.toString()+"\n"+ "La distancia entre los punto son: "+ Punto.CalcularDistancia(p1, p2));
////Punto.CalcularDistancia(p1, p2);
//            }
//        } while (op1!=2);
        
       
        
    }
}
