package NivelIntermediario.ClassEObjeto;

public class Ninja {
    String nome = "";
    int idade;
    String aldeia = "";

    public void nomeDoNinja() {
        System.out.println("\n" + "O nome do ninja é: " + nome);
    }

    public int idadeDaMissao(int idadeParaMissao) {
        return idadeParaMissao;
    }
}