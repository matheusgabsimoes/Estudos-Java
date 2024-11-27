package NivelFacil;
import java.util.Scanner;

public class ScannerUsuario {
    public static void main(String[] args) {
        // Abertura do Input do user
        System.out.print("\n" + "Digite o nome do ninja: ");
        Scanner caixaDeTexto = new Scanner( System.in);
        // Input de nome do ninja do user
        String nomeDoNinja = caixaDeTexto.nextLine();
        // Output de nome do user
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Input de idade do ninja do user
        System.out.print("\n" + "Digite a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        // Output de idade do user
        System.out.println("A idade do ninja é: " + idadeDoNinja);

        if (idadeDoNinja >= 18) {
            System.out.println("\n" + "Esse ninja é maior de idade e porde ir para missões fora da aldeia");
        } else {
            System.out.println("\n" + "Esse ninja é muito novo para missões fora da aldeia");
        }

        caixaDeTexto.close();
    }
}
