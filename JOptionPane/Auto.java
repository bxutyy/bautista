/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JOptionPane;

/**
 *
 * @author LABO B
 */

import javax.swing.JOptionPane;
public class Auto {
        String marca;
        String modelo;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        
        void arrancar (){
        JOptionPane.showMessageDialog(null, marca + " " + modelo + "ese es tu auto");
    }
    }
    public static void main(String[] args) {
        
    
            String String = JOptionPane.showInputDialog("ingresa la marca");
            JOptionPane.showMessageDialog(null, marca);
            
            JOptionPane.showInputDialog(null, "ingresa el modelo");
            JOptionPane.showMessageDialog(null, modelo);
       
        
        
    }    
    }

 

