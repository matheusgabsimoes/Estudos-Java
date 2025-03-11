package NivelIntermediario.Polimorfismo_Abstracao_Superclass;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.habilidade = "Rasengan";
        Naruto.habilidadeNinja();
        Naruto.habilidadeEspecial();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.habilidade = "Chidori";
        Sasuke.habilidadeNinja();
        Sasuke.habilidadeEspecial();

        // Construtor seguindo a super class
        Uchiha Itachi = new Uchiha("Itachi", "20", "Folha", "Sharingan", "Amaterasu");
        Itachi.habilidadeNinja();
        Itachi.habilidadeEspecial();
    }
}
