import jdk.jshell.execution.JdiExecutionControlProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> contasBancarias = new ArrayList<>();
        System.out.println("-==============-");
        System.out.println("1 - Criar nova conta");
        System.out.println("2 - Depositar valor em uma conta");
        System.out.println("3 - Sacar valor de uma conta");
        System.out.println("4 - Listar saldo da conta");
        System.out.println("-==============-");
        System.out.print("Escolha uma das opções: ");
        int escolha = sc.nextInt();


        String titular = "";
        String numeroConta = "";
        Double saldo = 0.0;
        ContaBancaria conta = new ContaBancaria(titular, numeroConta, saldo);

        while (escolha != 0) {
            //Para cadastrar nova conta
            if (escolha == 1) {
                sc.nextLine();
                System.out.print("Informe o nome do titular: ");
                titular = sc.nextLine();
                System.out.print("Informe o número da conta: ");
                numeroConta = sc.nextLine();
                System.out.print("Informe o valor do depósito inicial: ");
                saldo = sc.nextDouble();

                conta = new ContaBancaria(titular, numeroConta, saldo);
                contasBancarias.add(String.valueOf(conta));

            }

            //Para depositar dinheiro
            else if (escolha == 2) {
                System.out.print("Informe a quantidade a ser depositada: ");
                double valor = sc.nextDouble();
                conta.depositar(valor);

            }

            //Para sacar dinheiro
            else if (escolha == 3) {
                System.out.print("Informe a quantidade a ser sacada: ");
                double valor = sc.nextDouble();
                conta.sacar(valor);
            }

            //Para mostrar o saldo da conta
            else if (escolha == 4) {
                conta.mostrarSaldo();

            }

            else if (escolha == 5) {
                System.out.println(contasBancarias);
            }

            //Para obrigar o usuário a escolher uma opção válida
            else {
                System.out.println("Escolha um número válido!");
            }

            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();


        }
        //Finaliza o programa após o usuário digitar 0
        System.out.println("Programa finalizado");

        sc.close();
    }
}