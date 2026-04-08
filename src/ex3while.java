import java.util.Scanner;

public class ex3while {

        void main() {
           Scanner sc = new Scanner(System.in);
            IO.println("Digite um numero: ");
            int numero = sc.nextInt();
            int valor = 0;
            int um = 1;

            while (um <= 10) {
                valor = (valor + numero);
                um++;
                IO.println(valor);
            }
        }
    }

