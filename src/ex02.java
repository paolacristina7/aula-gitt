import java.util.Scanner;

public class ex02 {


            void main(){
                Scanner sc = new Scanner(System.in);
                IO.println("Digite seu Nome: ");
                String nome = sc.nextLine();
                IO.println("Escolha seu Prato: Macarrão, Parmegiana ou BigBurguer");
                String opcao = sc.nextLine();

                switch (opcao){
                    case "Macarrão":
                        IO.println(nome +" Se acabe na melhor massa da cidade!!");
                        IO.println("Valor do Prato: R$120,00");
                        break;
                    case "Parmegiana":
                        IO.println(nome +"Voce nao pode perder o sabOr dessa maravilha");
                        IO.println("Valor do Prato: R$550,99");
                        break;
                    case "BigBurguer":
                        IO.println(nome +"Voce tem que experimentar essa carne grelhada");
                        IO.println("Valor do Prato: R$999,99");
                        break;
                    default:
                        IO.println("Não temos no Cardapio");
                }
            }
        }



