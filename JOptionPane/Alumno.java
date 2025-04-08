/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author LABO B
 */
public class Alumno {
    
    String nombre;
    String nota;    

    public Alumno(String nombre, String nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
     void arrancar(){
         
         JOptionPane.showMessageDialog(null, "Arranco..");
         
     }
     
     public void ingresar () {
        String marca = JOptionPane.showInputDialog("ingtrsr la marca");
         String modelo = JOptionPane.showInputDialog("ingtrsr la modelo");
         
         Auto a1 = new Auto(marca, modelo);
         a1.arrancar();
         JOptionPane.showConfirmDialog(null, "tu marca es: "+marca);
         JOptionPane.showMessageDialog(null, "tu modelo es: "+modelo);
    }
}
