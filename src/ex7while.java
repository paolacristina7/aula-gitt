
import java.util.Scanner;

public class ex7while {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um número: ");
        int num = sc.nextInt();
        int i = num;
        int fatorial = 1;

        IO.println(num);

        while (i >= 1) {
            fatorial *= i;
            IO.println(i + (i > 1 ? " × " : ""));
            i--;
        }
        IO.println(fatorial);
    }
}

