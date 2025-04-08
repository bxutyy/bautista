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
public class Estudiantes {
    public static void main(String[] args) {
        
    }
        String nombre;
        String Apellido;
        int edad;
        String colorPelo;

    public Estudiantes(String nombre, String Apellido, int edad, String colorPelo) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.colorPelo = colorPelo;
    }

   
        
        //METODOS acciones que hacen
        
        void hablar(){
            System.out.println(nombre+"Esta hablando...");
        }
       
       
    
        void estudiar(){
            System.out.println("Esta estudiando...");  
        }
        void horLibre(){
            JOptionPane.showMessageDialog(null, "Esta en hora libre");
            
        }
}
           
       
    

