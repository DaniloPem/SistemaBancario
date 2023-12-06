import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       double saldoInicial = 2500.00;

       Scanner leituraDeDados = new Scanner(System.in);

       int opcaoInserida = 0;

        System.out.println("""
                   Operações
                   
                   1- Consultar saldos.
                   2- Receber valor.
                   3- Transferir valor.
                   4. Sair
                   """);

       while (opcaoInserida != 4){
           System.out.println("Digite a opção desejada:");
           opcaoInserida = leituraDeDados.nextInt();

           switch (opcaoInserida) {
               case 1:
                   System.out.println("O saldo atual é: " + saldoInicial);
                   break;
               case 2:
                   System.out.println("Infome o valor a receber:");
                   double valorRecebido = leituraDeDados.nextDouble();
                   if (valorRecebido >= 0) {
                       saldoInicial += valorRecebido;
                       System.out.println("Saldo atualizado: " + saldoInicial);
                   } else {
                       System.out.println("Valor inválido.");
                   }
                   break;
               case 3:
                   System.out.println("Informe o valor que deseja transferir:");
                   double valorTransferido= leituraDeDados.nextDouble();
                   if (valorTransferido <= saldoInicial && valorTransferido >= 0) {
                       saldoInicial -= valorTransferido;
                       System.out.println("Saldo atualizado: " + saldoInicial);
                   } else {
                       System.out.println("Saldo insuficiente.");
                   }
                   break;
               case 4:
                   System.out.println("Processo finalizado");
                   break;
               default:
                   System.out.println("Opção inválida.");
           }
        }
    }
}