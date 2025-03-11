package DesafioJava10x.Nivel_Intermediario.InterfacesEConstrutores;

public class Main {
    public static void main(String[] args) {
        NinjaAvancado Tsunade = new NinjaAvancado(  "Tsunade Senju",
                                                    54,
                                                    "Cura");
        Tsunade.mostrarInformacoes();
        Tsunade.executarHabilidade();
    }
}
