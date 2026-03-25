import java.util.Scanner;



    import java.util.Scanner;

    public class ex08 {

        public static void main(String[] args) {
            java.util.Scanner sc = new Scanner(System.in);

            // Solicita a idade ao usuário
            System.out.print("Por favor, digite a sua idade: ");
            int idadeInformada = sc.nextInt();

            // Chama o método que verifica a restrição


            // Informa o resultado
            if (idadeInformada >= 18) {
                System.out.println("Acesso Permitido! Bom evento.");
            } else {
                System.out.println("Acesso Negado! Entrada permitida apenas para maiores de 18 anos.");
            }


        }
    }
