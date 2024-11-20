package DesafioJava10x;

public class Ninjas {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 14;
        String missaoNinja1 = "Se tornar Hokage";
        char dificuldadeMissao1 = 'S';
        String statusMissao1 = "Em andamento";

        System.out.println("\n" + "Nome do Ninja: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missão Ninja: " + missaoNinja1);
        System.out.println("Nível da missão: " + dificuldadeMissao1);
        if (idadeNinja1 < 15) {
            if (dificuldadeMissao1 == 'C' || dificuldadeMissao1 == 'D')
                statusMissao1 = "Não concluída";
        } else {
            statusMissao1 = "Concluída";
        }
        System.out.println("Status da missão: " + statusMissao1);


        // Ninja 2
        String nomeNinja2 = "Sasuke";
        int idadeNinja2 = 25;
        String missaoNinja2 = "Matar o irmão";
        char dificuldadeMissao2 = 'S';
        String statusMissao2 = "Em andamento";

        System.out.println("\n" + "Nome do Ninja: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missão Ninja: " + missaoNinja2);
        System.out.println("Nível da missão: " + dificuldadeMissao2);
        if (idadeNinja2 < 15) {
            if (dificuldadeMissao2 == 'C' || dificuldadeMissao2 == 'D')
                statusMissao2 = "Não concluída";
        } else {
            statusMissao2 = "Concluída";
        }
        System.out.println("Status da missão: " + statusMissao2);

        // Ninja 3
        String nomeNinja3 = "Tsunade";
        int idadeNinja3 = 40;
        String missaoNinja3 = "Beber pra caraio";
        char dificuldadeMissao3 = 'D';
        String statusMissao3 = "Em andamento";

        System.out.println("\n" + "Nome do Ninja: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missão Ninja: " + missaoNinja3);
        System.out.println("Nível da missão: " + dificuldadeMissao3);
        if (idadeNinja3 < 15) {
            if (dificuldadeMissao3 == 'C' || dificuldadeMissao3 == 'D')
                statusMissao3 = "Não concluída";
        } else {
            statusMissao3 = "Concluída";
        }
        System.out.println("Status da missão: " + statusMissao3);
    }
}
