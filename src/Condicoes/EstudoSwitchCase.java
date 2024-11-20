package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha uma bandana:" + "\n" + "1: Vila da folha, 2: Vila da nevoa, 3: Vila da pedra: ");
        int bandana = scanner.nextInt();
        switch (bandana) {
            case 1:
                System.out.println("Voce escolheu a bandana da Vila da Folha");
                break;
            case 2:
                System.out.println("Voce escolheu a bandana da Nevoa");
                break;
            case 3:
                System.out.println("Voce escolheu a bandana da Vila da Pedra");
                break;
            default:
                System.out.println("Voce escolheu uma bandana que não é válida.");
                break;
        }
        scanner.close();
    }
}
