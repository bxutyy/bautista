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
public class Carrito {
      public static void main(String[] args) {
      int cantidad = Integer.parseInt( JOptionPane.showInputDialog("ingresar la cantidad de productos en tu carrito"));
      String [] productos = new String[cantidad];
      Double [] precio = new Double[cantidad];
      double total=0;
      String carrito = "tu carrito:";
          for (int i = 0; i < productos.length; i++) {
              productos[i]=JOptionPane.showInputDialog("ingresar elnombre de tu"+(i+1)+  "producto: ");
              precio[i]= Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del producto"+(i+1) ));
              carrito+= "-"+productos[i]+ "$ "+precio[i];
          }   
            carrito+="\nTOTAL GASTADO"+total;
              JOptionPane.showMessageDialog(null, carrito);
              
        
    }
    
}
