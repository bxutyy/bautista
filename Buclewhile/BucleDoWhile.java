/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buclewhile;

/**
 *
 * @author LABO B
 */
public class BucleDoWhile {
    public static void main(String[] args) {
         int contador = 1; // Inicializamos la variable
 
         do {
             System.out.println("Iteración número: " + contador);
             contador++; // Incrementamos el contador
         } while (contador <= 5); // Verificamos la condición después de ejecutar el código
 
         System.out.println("Fin del bucle.");
     }
}
