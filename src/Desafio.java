import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Kara Zor-El";
        String tipoDeConta = "Corrente";
        double saldo = 5500.00;
        boolean menu = true;

        System.out.println("******************************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.printf("Saldo atual: R$%.2f", saldo);
        System.out.println("\n******************************************\n");

        while (menu){
            System.out.println("-----------------Menu-----------------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Transferir valor");
            System.out.println("3 - Receber valor");
            System.out.println("4 - Sair");

            System.out.println("Digite a opção desejada: ");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.printf("\nO saldo atualizado: R$%.2f\n", saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorTransferido = sc.nextDouble();

                    if(valorTransferido <= 0){
                        System.out.println("Transferência cancelada: O valor deve ser maior que zero.");
                    } else if (valorTransferido > saldo){
                        System.out.println("Transferência cancelada: Saldo insuficiente!");
                    } else {
                        saldo -= valorTransferido;
                        System.out.println("Valor transferido com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor a receber: ");
                    double valorAReceber = sc.nextDouble();

                    System.out.println("Valor recebido!");
                    saldo += valorAReceber;
                    break;

                case 4:
                    System.out.println("Saindo...");
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
