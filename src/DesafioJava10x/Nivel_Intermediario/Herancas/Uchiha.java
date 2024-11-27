package DesafioJava10x.Nivel_Intermediario.Herancas;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    // Define a habilidade
    public void addHabilidade(String habilidade) {
        this.habilidadeEspecial = habilidade;
    }

    // Mostra a habilidade
    public String mostrarHabilidadeEspecial() {
        System.out.println("Habilidade especial: " + habilidadeEspecial + "\n");
        System.out.println("Ninja " + nome + " cadastrado com sucesso!");
        return habilidadeEspecial;
    }

    // Exibe as informações no final
    public String mostrarHabilidadeComInformacoes() {
        return mostrarInformacoes() + mostrarHabilidadeEspecial();
    }


}