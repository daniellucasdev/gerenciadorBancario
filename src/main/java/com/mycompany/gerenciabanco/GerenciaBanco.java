package com.mycompany.gerenciabanco;

import java.util.Scanner;

public class GerenciaBanco {

    static class ContaBancaria {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== sistema de gerenciamento bancário ===");
        System.out.println("Iniciando cadastro\n");

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Informe seu CPF: ");
        String cpf = sc.nextLine();

        System.out.println("\nCadastro concluído com sucesso");
    }
}
