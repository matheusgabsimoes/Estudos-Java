package DesafioJava10x.Nivel_Intermediario.Herancas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n" + "Digite o nome do ninja: ");
        String nomeDoNinja = scanner.nextLine();

        System.out.print("Idade: ");
        int idadeDoNinja = scanner.nextInt();

        System.out.print("Missão: ");
        String missaoDoNinja = scanner.nextLine();

        System.out.print("Dificuldade da missão (S, A, B, C): ");
        String nivelDificuldadeDaMissao = scanner.nextLine();

        System.out.print("Status da missão: ");
        String statusMissaoDoNinja = scanner.nextLine();

        System.out.print("Habilidade especial do ninja: ");
        String habilidadeDoNinja = scanner.nextLine();

        // Cadastro do ninja
        Uchiha nome = new Uchiha();
        nome.nome = nomeDoNinja;
        nome.idade = idadeDoNinja;
        nome.missao = missaoDoNinja;
        nome.nivelDificuldade = nivelDificuldadeDaMissao;
        nome.statusMissao = statusMissaoDoNinja;
        nome.addHabilidade(habilidadeDoNinja);
        nome.mostrarHabilidadeComInformacoes();

    }
}
