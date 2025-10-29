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
        public String getNome() {
            return nome;
        }
        public String getSobrenome() {
            return sobrenome;
        }
        public String getCpf() {
            return cpf;
        }
        public double getSaldo() {
            return saldo;
        }
        public void exibirInformacoes() {
            System.out.println("\n--- Dados do cliente ---");
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("CPF: " + cpf);
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistema de Gerenciamento Bancário ===");
        System.out.println("Cadastro de cliente\n");
        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe seu sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.print("Informe seu CPF: ");
        String cpf = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(nome, sobrenome, cpf);
        conta.exibirInformacoes();
    }
}
