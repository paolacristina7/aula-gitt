import java.util.Scanner;

public class loop2 {
     void main() {
         Scanner sc = new Scanner(System.in);
         IO.println("digite um numero (ou 0 para exit:");
         int numero = sc.nextInt();

         while (numero !=0) {
             if (numero % 2 == 0) {
                 IO.println("o numero" + numero + "é par");
             } else {
                 IO.println("o numero" + numero + "é impar");
             }
             IO.println("digite outro numero (ou 0 para exit):");
             numero = sc.nextInt();
             }
         IO.println("voce digitou 0. é o final do programa");
         }
    }

