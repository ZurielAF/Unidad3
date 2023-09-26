/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_o_impar;
 import java.util.Scanner;

/**
 *
 * @author Zu'
 */
public class Par_o_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese un numero entero: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
                scanner.close();
    }
}

    
    

