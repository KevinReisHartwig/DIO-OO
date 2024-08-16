package model;

import interfaces.IConta;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
	
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private List<Transacao> historico = new ArrayList<>();

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            adicionarTransacao("Saque", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            adicionarTransacao("Depósito", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor > 0 && this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            adicionarTransacao("Transferência", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    private void adicionarTransacao(String tipo, double valor) {
        this.historico.add(new Transacao(tipo, valor));
    }

    @Override
    public void imprimirHistorico() {
        System.out.println("=== Histórico de Transações ===");
        for (Transacao transacao : historico) {
            System.out.println(transacao);
        }
    }
}
