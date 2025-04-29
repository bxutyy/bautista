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
public class Strimes {
    public static void main(String[] args) {
        String [] nombreStriamers = new String[5];
        String lista ="tu ranking de Strimears favoritos";
        for (int i = 0; i < nombreStriamers.length; i++) {
          nombreStriamers[i] = JOptionPane.showInputDialog(null, "INGRESA EL"+(i+1) +"NOMBRE DE TU STRIAMER"); 
          lista+="\n"+(i+1)+"."+nombreStriamers[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, lista);
        String nombreStreamersFav=JOptionPane.showInputDialog("cual es de estos tu Sreamer fav");
        JOptionPane.showMessageDialog(null, "tu Streamer Fav es: "+nombreStreamersFav);
    }
    
    }

