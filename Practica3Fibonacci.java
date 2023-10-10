
package practica3fibonacci;

import java.util.Scanner;

/**
 *
 * @author Zuriel
 */
public class Practica3Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un numero de la serie fibonacci: ");
        int n = scanner.nextInt();
        
        int a = 0;
        int b = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ": " + a);
            b = b + a;
            a = b - a;
        }
    }
}
