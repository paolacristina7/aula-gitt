import java.util.Scanner;

        public class ex2while {
            static void main() {
                Scanner sc =new Scanner(System.in);
                IO.println("Digite o valor desejado");
                int contador=1;
                int numerousuario= sc.nextInt();
                int resultado = 0;

                IO.println(contador);
                contador++;
                while (contador <= numerousuario) {
                    IO.println(contador);
                    contador++;

                }
            }
        }