package DesafioJava10x.Nivel_Intermediario.Herancas;

public class Ninja {
    String nome = "";
    int idade;
    String missao = "";
    String nivelDificuldade = "";
    String statusMissao = "";

    // Informações no final
    public String mostrarInformacoes() {
         System.out.println("\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Missão: " + missao + "\n" +
                "Nivel de Dificuldade: " + nivelDificuldade + "\n" +
                "Status da Missão: " + statusMissao);
         return "";
    }
}
