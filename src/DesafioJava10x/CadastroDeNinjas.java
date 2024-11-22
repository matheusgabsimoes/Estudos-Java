package DesafioJava10x;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de ninjas
        String[] ninja = null;
        int quantidadeDeNinjas = 0;

        // Menu de escolha
        while (true) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            // Switch case para o menu de escolha
            int escolhasMenu = scanner.nextInt();
            switch (escolhasMenu) {
                case 1:
                    // Cadastro de ninjas
                    System.out.print("Quantos ninjas deseja cadastrar? ");
                    quantidadeDeNinjas = scanner.nextInt();
                    scanner.nextLine();

                    ninja = new String[quantidadeDeNinjas];

                    for (int i = 0; i < quantidadeDeNinjas; i++) {
                        System.out.print("Digite o nome do ninja " + (i + 1) + ": ");
                        ninja[i] = scanner.nextLine();
                    }
                    System.out.println("Cadastro concluído!");
                    break;

                case 2:
                    // Listar ninjas cadastrados
                    if (ninja == null || ninja.length == 0) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        System.out.println("Ninjas cadastrados:");
                        for (int i = 0; i < ninja.length; i++) {
                            System.out.println((i + 1) + ". " + ninja[i]);
                        }
                    }
                    break;

                case 3:
                    // Sair do programa
                    scanner.close();
                    System.out.println("Programa encerrado!");
                    return;

                default:
                    System.out.println("Você escolheu uma opção que não é válida");
                    break;
            }
        }
    }
}
