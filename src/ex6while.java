import java.util.Scanner;

public class ex6while {
    static void main() {
                Scanner sc = new Scanner(System.in);
                IO.println("Digite sua nota ou (-1) para sair: ");
                double nota = sc.nextDouble();
                double media =0;
                int valor = 0;
                while (nota != -1){
                    IO.println("Digite outra nota ou (-1) para sair: ");
                    valor +=1;
                    media +=nota;
                    nota = sc.nextDouble();

                }
                double a = media/valor;
                IO.println("Sua media é: "+ a );
            }
        }

