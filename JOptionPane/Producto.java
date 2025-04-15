/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JOptionPane;

/** < > [ ]
 *
 * @author LABO B
 */

import javax.swing.JOptionPane;
public class Producto {
     String nombre;
    double precio;

    public Producto(String nombre, double nota) {
        this.nombre = nombre;
        this.precio= nota;
    }

    void ingresoDatos() {
        nombre = JOptionPane.showInputDialog("ingrese tu nombre");
        precio = Double.parseDouble(JOptionPane.showInputDialog("ingresa tu nota"));
    }

    void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Hola ! " + nombre);
        JOptionPane.showMessageDialog(null, "tu nota es: "+precio);
    }

    void caro() {
        if (precio <= 6) {

            JOptionPane.showMessageDialog(null, "aprobo con " + precio);
        } else {
            JOptionPane.showMessageDialog(null, "desaprobo con :" + precio);

        }

    }
    public static void main(String[] args) {
        Alumno a1 = new Alumno("", 0);
        a1.ingresoDatos();
        a1.mostrarDatos();
        a1.caro();
    }
}
