package DesafioJava10x.Nivel_Intermediario.InterfacesEConstrutores;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    public NinjaAvancado(String nome, int idade, String habilidade) {
        super(nome, idade, habilidade);
    }

    @Override
    public void tipoHabilidade() {
        super.tipoHabilidade();
    }
}
