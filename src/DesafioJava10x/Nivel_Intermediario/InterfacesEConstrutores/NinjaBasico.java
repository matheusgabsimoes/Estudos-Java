package DesafioJava10x.Nivel_Intermediario.InterfacesEConstrutores;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é: " + nome +
                            "\nMinha idade é: " + idade);
    }

    @Override
    public String executarHabilidade() {
        return "\nMinha habilidade " + habilidade + "foi utilizada";
    }

    public void tipoHabilidade() {
        System.out.println("Meu tipo de habilidade é: " + habilidade);
    }
}
