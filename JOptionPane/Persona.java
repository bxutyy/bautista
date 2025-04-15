/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JOptionPane;

/**Crear una clase Persona con los atributos nombre y edad.
Usar JOptionPane para pedir los datos.
Crear un método esMayorDeEdad() que devuelva true si la edad es mayor o  igual a 18.
📢 Mostrar si la persona es mayor de edad o menor.

 *
 * @author LABO B
 */
import javax.swing.JOptionPane;
public class Persona {
        String nombre;
        double edad;

    public Persona(String nombre, double edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void IngresoDeDatos() {
        nombre = JOptionPane.showInputDialog("ingrse su nombre: ");
        edad = JOptionPane.showInputDialog("ingrese su edad:")
        
        
    }
    

