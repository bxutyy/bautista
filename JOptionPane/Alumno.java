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
    double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    void ingresoDatos() {
        nombre = JOptionPane.showInputDialog("ingrese tu nombre");
        nota = Double.parseDouble(JOptionPane.showInputDialog("ingresa tu nota"));
    }

    void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Hola ! " + nombre);
        JOptionPane.showMessageDialog(null, "tu nota es: "+nota);
    }

    void aprobo() {
        if (nota <= 6) {

            JOptionPane.showMessageDialog(null, "aprobo con " + nota);
        } else {
            JOptionPane.showMessageDialog(null, "desaprobo con :" + nota);

        }

    }
    public static void main(String[] args) {
        Alumno a1 = new Alumno("", 0);
        a1.ingresoDatos();
        a1.mostrarDatos();
        a1.aprobo();
    }

    void caro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
