/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import javax.swing.JOptionPane;

/**
 *
 * @author LABO B
 */
public class Perro {

    String nombre;
    String Raza;

    public Perro(String nombre, String Raza) {
        this.nombre = nombre;
        this.Raza = Raza;
    }

    //METODOS acciones que hacen
    void ladrar() {
        JOptionPane.showMessageDialog(null, nombre + " " + Raza + "GUA GUA");
    }

}
class main{
    public static void main(String[] args) {
        
       Perro p1 = new Perro("murillo", "callegera  ");
       
       
       p1.ladrar();
        
    }
}