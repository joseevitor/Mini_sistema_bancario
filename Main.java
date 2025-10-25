import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double saldo;
        String nome;
        String tipoConta;
        int opcao = 0;

        System.out.println("Qual o seu nome? ");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();
        System.out.println("Qual o tipo de conta que deseja? ");
        scanner.nextLine();
        tipoConta = scanner.nextLine();
        System.out.println("Saldo atual: ");
        scanner.nextDouble();
        saldo = scanner.nextDouble();



        System.out.println("Nome de usuário: " + nome +
                "\nTipo de de conta: " + tipoConta +
                "\nSaldo: R$" + saldo%2f);

        String menu = """
                *** Digite sua opção ***
                1 - Consultar saldo
                2 - Fazer transferencia
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);


        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
        }if(saldo == 1){
            System.out.println("O saldo atualizado é: " + saldo);
        } else if(opcao == 2){
            System.out.println("Qual o valor que deseja transferir? ");
            double valor = leitura.nextDouble();
            if(valor > saldo){
                System.out.println("Não há saldo para realizar a transferência!");

            } else{
                saldo = saldo - valor;
            }
        }



    }

}