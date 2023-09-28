
package cajero;
import java.util.Scanner;

public class Cajero {
 
    public static void main(String[] args) {
 
   int saldo = 3000, retirar, deposito;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("BIENVENIDO AL CAJERO AUTOMATICO\n ");
            System.out.println("-----------------------------------");
            System.out.println("PRESIONE 1 PARA RETIRAR SALDO");
            System.out.println("PRESIONE 2 PARA DEPOSITAR SALDO");
            System.out.println("PRESIONE 3 PARA VERIFICAR SU SALDO");
            System.out.println("------------------------------------\n");
            System.out.print("SELECCIONE UNA OPCION:");
            int n = scanner.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("\nINGRESE LA CANTIDAD QUE DESEA RETIRAR:");
                retirar = scanner.nextInt();
                if(saldo >= retirar)
                {
                    saldo = saldo - retirar;
                    System.out.println("\nDINERO RETIRADO EXITOSAMENTE");
                }
                else
                {
                    System.out.println("\nSALDO INSUFICIENTE");
                }
 
                System.out.println("");
                break;
 
                case 2:
                System.out.print("\nINGRESE LA CANTIDAD QUE DESEA DEPOSITAR:");
                deposito = scanner.nextInt();
                saldo = saldo + deposito;
                System.out.println("\nSU DINERO HA SIDO DEPOSITADO EXITOSAMENTE");
 
                break;
 
                case 3:
                System.out.println("SALDO : "+saldo);
 
                break;
 
                case 4:
                System.out.println("OPERACION INVALIDA, POR FAVOR SELECCIONE OTRA OPCION:");
                System.exit(0);
            }
        }
    }
}
    
    

