/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author 000093883
 */
public class Fibonacci {
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de fibonacci a ver"));
        int fibonacciNumber = fibonacci(number);
        JOptionPane.showMessageDialog(null, String.valueOf(fibonacciNumber));
    }
    
}
