import java.util.Scanner;

public class ex01 {


    void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Digite seu nome");
        String nome = sc.nextLine();
        String curso;
        IO.println("Qual curso voce está");

        curso = sc.nextLine();

        IO.println("Digite seu idade");

        int idade = sc.nextInt();
        if (idade <= 0 & idade < 18) {
            IO.println("Não pode!");
        } else if (idade >= 18) {
            IO.println("pode participar");
            IO.println("informações do aluno");
            IO.println("seu curso é: " + curso);
            IO.println("seu nome é" + nome);
            IO.println("sua idade é:" + idade);

        } else
            IO.println("saia daqui");
    }
}