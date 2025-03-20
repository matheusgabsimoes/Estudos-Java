package NivelIntermediario.Enums;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Salvar gato", rankDeMissoes.D);
        missao1.exibirDetalhes();

        System.out.println("--------------------------------------------");

        Missoes missao2 = new Missoes("Teste do sino (Pegar o sino do Kakashi)", rankDeMissoes.C);
        missao2.exibirDetalhes();
    }

}
