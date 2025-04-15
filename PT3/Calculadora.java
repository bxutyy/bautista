/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PT3;

/**
 *
 * @author LABO B
 */
import javax.swing.JOptionPane;

public class Calculadora {

    public double sumar(double x, double t) {
        return x + t;
    }

    ;
      public double restar(double x, double t) {
        return x - t;
    }

    ;
      public double multiplicar(double x, double t) {
        return x * t;
    }

    ;
      public double dividir(double x, double t) {
        if (x != 0) {
            return x / t;

        } else {
            JOptionPane.showMessageDialog(null, "no se puede dividir entre 0: ");
            return 0;

        }
    }

    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        String opcion = JOptionPane.showInputDialog("calculadora: \n 1.sumar \n 2.resta \n 3.multiplicacion \n 4.division ");

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero: "));
        double resultado = 0;

        switch (opcion) {
            case "1":
                resultado = c1.sumar(num1, num2);
                break;
            case "2":
                resultado = c1.restar(num1, num2);
                break;
            case "3":
                resultado = c1.multiplicar(num1, num2);
                break;
            case "4":
                resultado = c1.dividir(num1, num2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
                return;
        }
        JOptionPane.showMessageDialog(null, "" + resultado);
    }
}


