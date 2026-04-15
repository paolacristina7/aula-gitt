import java.util.Scanner;

public class ex4while {
        void main () {
        Scanner sc = new Scanner(System.in);
        IO.println("Tenta Descobrir o Numero Secreto: ");
        int numero = sc.nextInt();

        while (numero != 7) {
            IO.println("Voce Errou Tente Novamente: ");
            numero = sc.nextInt();
        }
        IO.println("Voce Acertou!!");
    }

    }
