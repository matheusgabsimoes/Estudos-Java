package Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        // Entrada de input do user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Idade do ninja: ");
        int idadeDoNinja = scanner.nextInt();

        // Variveis do ternario
        String missaoForaVila = "O ninja pode fazer missões fora da vila";
        String missaoDentroVila = "O ninja é muito novo para fazer missões fora da vila";

        // Ternario
        String resultado = (idadeDoNinja >= 18) ? missaoForaVila : missaoDentroVila;

        // Output do ternario
        System.out.println(resultado);

        scanner.close();
    }
}
