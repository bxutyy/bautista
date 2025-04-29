/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author LABO B
 */
import javax.swing.JOptionPane;
public class inventario {
    public static void main(String[] args) {
         String[] inventario = new String[5];    
     inventario [0]= "Espada";
     inventario [1]= "pico";
     inventario [2]= "pan";
     inventario [3]= "pala";
     
        System.out.println("");
        JOptionPane.showMessageDialog(null, inventario[2]);
        
        String[] herramientas = {"Espada", "pico", "hacha"};
        
        for (int i = 0; i < herramientas.length; i++) {
            System.out.println("slot " + i +":" + herramientas[i]);
            
            JOptionPane.showMessageDialog(null, herramientas);
            
        }
    }
   
       
    
   
    
}
