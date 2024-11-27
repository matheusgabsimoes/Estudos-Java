package NivelIntermediario.ClassEObjeto;

public class Main {
    public static void main(String[] args) {

        // Criando um objetos da classe Ninja
        // Objeto Naruto
        Ninja Naruto = new Ninja();
            Naruto.nome = "Naruto Uzumaki";
            Naruto.idade = 14;
            Naruto.aldeia = "Aldeia da Folha";

        // Objeto Sasuke
        // Usando herança
        Uchiha Sasuke = new Uchiha();
            Sasuke.nome = "Sasuke Uchiha";
            Sasuke.idade = 14;
            Sasuke.aldeia = "Aldeia da Folha";

        System.out.println("\n" +
                 "Nome: " + Sasuke.nome + "\n" +
                "Idade: " + Sasuke.idade + "\n" +
                "Aldeia: " + Sasuke.aldeia);

        Sasuke.usarSharingan();
        Sasuke.verificarCombate();
        Sasuke.susanoAtivo();

        // APLICANDO METEDO AOS OBJETOS

        // Chamando metodo para o Sasuke
        Sasuke.nomeDoNinja();

        // Chamando metodo com parametro
        int podeIrParaMissao = Sasuke.idadeDaMissao(19);
            if (Sasuke.idade >= podeIrParaMissao) {
                System.out.println("O ninja " + Sasuke.nome + " pode ir para missão");
            } else {
                System.out.println("O ninja " + Sasuke.nome + " não tem idade suficiente para a missão");
            }
    }

}
