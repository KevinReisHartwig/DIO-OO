package model;

public class ContaCorrente extends Conta {

    private static final double TAXA_SAQUE = 1.00;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + TAXA_SAQUE);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
