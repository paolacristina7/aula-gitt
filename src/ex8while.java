import java.util.Scanner;

import java.util.Scanner;

public class ex8while{

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Digite um numero :");
        int numeroresposta = sc.nextInt();

        int contador = 1;
        int soma =  0;


        while (contador <= numeroresposta) {
            if  (contador % 2 == 0) {
                soma += contador;
            }
            contador++;
        }

        IO.println("Soma: " + soma);



    }


}