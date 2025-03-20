package NivelIntermediario.Enums;

public enum rankDeMissoes {
    D("Simples", 1),
    C("Baixa", 2),
    B("Moderada", 3),
    A("Alta", 4),
    S("Altissima", 5);

    private String nivel;
    private int dificuldade;

    rankDeMissoes(String nivel, int dificuldade) {
        this.nivel = nivel;
        this.dificuldade = dificuldade;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
