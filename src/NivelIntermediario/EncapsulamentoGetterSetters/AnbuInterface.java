package NivelIntermediario.EncapsulamentoGetterSetters;

public interface AnbuInterface {

    boolean fazParteDosAnbu();

    default boolean esquadraoAnbu() {
        if (fazParteDosAnbu()) {
            System.out.println("Faz parte do esquadrão Anbu");
            return true;
        }
        System.out.println("Já foi do esquadrão Anbu");
        return false;
    }
}
