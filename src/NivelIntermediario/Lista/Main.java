package NivelIntermediario.Lista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Hinata");
        ninjasList.add("Kakashi");
        System.out.println("Lista de ninjas = " + ninjasList);

        // remover da lista
        ninjasList.remove("Kakashi");
        System.out.println("Lista de ninjas = " + ninjasList);

        // altera o elemento do index selecionado
        ninjasList.set(2, "Itachi");
        System.out.println("Lista de ninjas = " + ninjasList);

        // tamanho da lista
        System.out.println("Tamanho da lista = " + ninjasList.size() + " elementos");

    }
}
