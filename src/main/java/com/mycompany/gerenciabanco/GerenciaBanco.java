package com.mycompany.gerenciabanco;
import java.util.Scanner;
public class GerenciaBanco {
    static class ContaBancaria {
        private String nome;
        private String sobrenome;
        private String cpf;
        private double saldo;
        public ContaBancaria(String nome, String sobrenome, String cpf) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cpf = cpf;
            this.saldo = 0.0;
        }
        public void consultarSaldo() {
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        }
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }
        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente!");
            } else {
                System.out.println("Valor inválido para saque.");
            }
        }
        public void exibirDados() {
            System.out.println("\n--- Dados do cliente ---");
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("CPF: " + cpf);
            consultarSaldo();
        }
    }
    public static void exibirMenu(ContaBancaria conta) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n====== MENU DA NULLBANK ======");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Exibir dados da conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Informe o valor do depósito: R$ ");
                    double valorDep = sc.nextDouble();
                    conta.depositar(valorDep);
                    break;
                case 3:
                    System.out.print("Informe o valor do saque: R$ ");
                    double valorSaq = sc.nextDouble();
                    conta.sacar(valorSaq);
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 0:
                    System.out.println("\nObrigado por utilizar o sistema bancário. Até logo!");
                    break;
                default:
                    System.out.println("Essa opcao nao existe");
            }
        } while (opcao != 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BEM VINDO AO NULLBANK ===");
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Sobrenome do cliente: ");
        String sobrenome = sc.nextLine();
        System.out.print("Informe seu CPF: ");
        String cpf = sc.nextLine();
        ContaBancaria conta = new ContaBancaria(nome, sobrenome, cpf);
        exibirMenu(conta);
    }
}
