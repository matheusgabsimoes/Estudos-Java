package NivelIntermediario.Enums;

public class Missoes {
    private String nome;
    private rankDeMissoes rank;

    public Missoes() {
    }

    public void exibirDetalhes() {
        System.out.println("Missão: " + nome + " \nRank:" + rank + " ( Nível:" + rank.getNivel() + " - Dificuldade:" + rank.getDificuldade() + " )");
    }

    public Missoes(String nome, rankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public rankDeMissoes getRank() {
        return rank;
    }

    public void setRank(rankDeMissoes rank) {
        this.rank = rank;
    }
}
