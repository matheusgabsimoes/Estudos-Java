package DesafioJava10x.Nivel_Intermediario.Desafio5;

public abstract class ContaBancaria implements Conta {
    String usuario;
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria() {
    }

    // Super class
    public ContaBancaria(String usuario, double saldo, TipoConta tipoConta) {
        this.usuario = usuario;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println(usuario + " tem o saldo na conta " + tipoConta + " de: " + saldo);
    }

    @Override
    public abstract void depositar(double valor);

    public void confirmarDeposito(double valor, double taxaDeposito) {
        if (valor <= 0) {
            System.out.println  ("""
                                    Falha no depósito. \
                                    Saldo de depósito não pode ser menor/igual a 0. \
                                    Tente novamente
                                """);
        } else {
            System.out.println("teste");
        }
    }

}
