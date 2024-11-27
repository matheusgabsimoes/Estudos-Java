package NivelIntermediario.ClassEObjeto;

import java.util.Scanner;

public class Uchiha extends Ninja {
    Scanner scanner = new Scanner(System.in);

    boolean usarSharingan() {
        if (idade >= 12) {
            System.out.println(nome + " pode usar o Sharingan ");
            return true;
        } else {
            System.out.println(nome + " não tem idade o suficiente para usar Sharingan");
            return false;
        }
    }

    // Pergunta para o usuario se está em combate
    boolean combate;
    void verificarCombate() {
        System.out.print("\n" + nome + " está em combate? (true/false): ");
        combate = scanner.nextBoolean();
    }

    // Ativar o susano
    void susanoAtivo() {
        // Se estiver em combate e com sharingan ativa o Susano
        if (combate && usarSharingan()) {
            System.out.println("\n" + "Susano está ativo");
        } else {
            System.out.println("\n" + "Susano só pode ser ativado quando o Sharingan estiver ativo");
        }
    }
}