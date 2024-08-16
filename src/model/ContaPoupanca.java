package model;

public class ContaPoupanca extends Conta {

    private static final double RENDIMENTO_MENSAL = 0.02; 

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void aplicarRendimento() {
        double rendimento = this.getSaldo() * RENDIMENTO_MENSAL;
        this.depositar(rendimento);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
