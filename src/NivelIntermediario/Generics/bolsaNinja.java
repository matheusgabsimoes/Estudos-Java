package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class bolsaNinja<T> {

    private List<T> equipamentoNinja;

    public bolsaNinja() {
        this.equipamentoNinja = new ArrayList<>();
    }

    public void addItemNaBolsa(T itemNaBolsa) {
        equipamentoNinja.add(itemNaBolsa);
    }

    // Print lista
    public void exibirEquipamentos() {
        for (T itemNaBolsa : equipamentoNinja ) {
            System.out.println(itemNaBolsa);
        }
    }
}
